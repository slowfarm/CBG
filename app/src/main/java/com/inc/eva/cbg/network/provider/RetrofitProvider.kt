package com.inc.eva.cbg.network.provider

import com.inc.eva.cbg.network.RemoteService

interface RetrofitProvider {

    fun provideRetrofit(): RemoteService
}
