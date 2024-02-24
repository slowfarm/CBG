package com.inc.eva.cbg.network.provider

import android.content.Context
import com.google.gson.GsonBuilder
import com.inc.eva.cbg.network.RemoteService
import com.inc.eva.cbg.network.utils.BasicAuthInterceptor
import com.inc.eva.cbg.network.utils.CheckNetworkInterceptor
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level.BODY
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RetrofitProviderImpl
    @Inject
    constructor(
        @ApplicationContext private val appContext: Context,
    ) : RetrofitProvider {
        override fun provideRetrofit(): RemoteService {
            val client =
                OkHttpClient.Builder()
                    .connectTimeout(5L, TimeUnit.SECONDS)
                    .readTimeout(5L, TimeUnit.SECONDS)
                    .hostnameVerifier { _, _ -> true }
                    .addNetworkInterceptor(HttpLoggingInterceptor().apply { level = BODY })
                    .addInterceptor(CheckNetworkInterceptor(appContext))
                    .addInterceptor(BasicAuthInterceptor())
                    .build()

            return Retrofit.Builder()
                .baseUrl("https://api.kinopoisk.dev/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                .build()
                .create(RemoteService::class.java)
        }
    }
