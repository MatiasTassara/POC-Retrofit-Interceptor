package com.example.demo.interceptors

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class RepoInterceptor {
    fun intercept(chain: Interceptor.Chain){

        var request: Request = chain.request()
        request = request.newBuilder()
                .addHeader("hola","que tal")
                .removeHeader("User-agent")
                .build()

        val response: Response = chain.proceed(request)

    }

}