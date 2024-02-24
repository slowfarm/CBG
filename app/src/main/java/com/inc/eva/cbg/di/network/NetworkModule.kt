package com.inc.eva.cbg.di.network

import com.inc.eva.cbg.network.provider.RetrofitProvider
import com.inc.eva.cbg.network.provider.RetrofitProviderImpl
import com.inc.eva.cbg.network.repository.RemoteRepository
import com.inc.eva.cbg.network.repository.RemoteRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent

@InstallIn(
    ViewModelComponent::class,
    SingletonComponent::class,
)
@Module
abstract class NetworkModule {
    @Binds
    abstract fun bindRemoteRepository(repository: RemoteRepositoryImpl): RemoteRepository

    @Binds
    abstract fun bindRetrofitProvider(provider: RetrofitProviderImpl): RetrofitProvider
}
