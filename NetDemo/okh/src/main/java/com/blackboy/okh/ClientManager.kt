package com.blackboy.okh

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

/**
 * 网络请求：
 * 1，直接使用OKHttp去请求的，所有相关的自己去实现，
 * 2，使用Retrofit去实现，
 * 3，加入lifecycle的liveData来实现
 *
 *
 */
class ClientManager {

    // 静态
    companion object {
        val mInstance: ClientManager = ClientManager()
    }


    /**
     * 生成一个普通的 client
     */
    fun getCommonClient(): OkHttpClient? {
        val builder = OkHttpClient.Builder()
        // 超时的相关设置
        builder.callTimeout(12, TimeUnit.SECONDS)
        builder.connectTimeout(12, TimeUnit.SECONDS)
        builder.readTimeout(20, TimeUnit.SECONDS)
        builder.writeTimeout(20, TimeUnit.SECONDS)
        // 错误重连
        builder.retryOnConnectionFailure(true)
        return builder.build()
    }


    fun get() {

    }
}