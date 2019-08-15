package com.mgtow.brotherhoodoffreedom.storiessender.config

import com.google.gson.Gson
import com.vk.api.sdk.client.TransportClient
import com.vk.api.sdk.client.VkApiClient
import com.vk.api.sdk.httpclient.HttpTransportClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class VkConfig {

    @Bean
    fun transportClient(): TransportClient = HttpTransportClient.getInstance()


    @Bean
    fun vk(transportClient: TransportClient) = VkApiClient(transportClient)

}