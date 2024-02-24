package com.inc.eva.cbg.network.utils

import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

class BasicAuthInterceptor : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        return chain.proceed(
            original
                .newBuilder()
                .header("X-API-KEY", "C12ECQD-A8Z4E6R-Q7X062C-WC2Y8SA")
                .method(original.method, original.body)
                .build(),
        )
    }
}