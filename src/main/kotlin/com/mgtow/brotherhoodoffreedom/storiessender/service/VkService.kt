package com.mgtow.brotherhoodoffreedom.storiessender.service

import com.vk.api.sdk.client.VkApiClient
import org.springframework.stereotype.Service

@Service
class VkService (val vk: VkApiClient) {

    fun post() {
        vk.wall().post().ownerId().attachments().build()
    }
}