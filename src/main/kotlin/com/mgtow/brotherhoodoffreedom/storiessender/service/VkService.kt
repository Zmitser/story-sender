package com.mgtow.brotherhoodoffreedom.storiessender.service

import com.vk.api.sdk.client.VkApiClient
import com.vk.api.sdk.client.actors.UserActor
import com.vk.api.sdk.objects.wall.responses.PostResponse
import org.springframework.stereotype.Service

@Service
class VkService(val vk: VkApiClient) {

    fun auth(): UserActor {
        val authResponse = vk.oAuth()
                .userAuthorizationCodeFlow(1, "", "", "")
                .execute()
        return UserActor(authResponse.userId, authResponse.accessToken);
    }

    fun suggestPost(): PostResponse {
        return vk.wall().post(UserActor(1, ""))
                .ownerId(-1)
                .message("")
                .attachments("")
                .execute()
    }
}