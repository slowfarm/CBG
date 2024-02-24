package com.inc.eva.cbg.network.repository

import com.inc.eva.cbg.network.RemoteService
import com.inc.eva.cbg.network.entity.Category
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteRepositoryImpl
    @Inject
    constructor(
        private val remoteService: RemoteService,
    ) : RemoteRepository {
        override suspend fun getCategories(): List<Category> = remoteService.getCategories()

        override suspend fun getMoviesByCategory(categories: Array<String>) = remoteService.getMovies(categories)
    }
