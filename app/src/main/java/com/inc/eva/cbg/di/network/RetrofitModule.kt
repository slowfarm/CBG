package com.inc.eva.cbg.di.network

import com.inc.eva.cbg.network.RemoteService
import com.inc.eva.cbg.network.provider.RetrofitProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object RetrofitModule {

    @Provides
    fun provideRemoteService(retrofitProvider: RetrofitProvider): RemoteService =
        retrofitProvider.provideRetrofit()
}
