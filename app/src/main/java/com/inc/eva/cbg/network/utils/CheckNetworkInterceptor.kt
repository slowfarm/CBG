package com.inc.eva.cbg.network.utils

import android.content.Context
import com.inc.eva.cbg.R
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

class CheckNetworkInterceptor(private val context: Context) : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        if (!context.isNetworkAvailable()) {
            throw NetworkException(context.getString(R.string.network_unavailable))
        }
        return chain.proceed(chain.request())
    }
}