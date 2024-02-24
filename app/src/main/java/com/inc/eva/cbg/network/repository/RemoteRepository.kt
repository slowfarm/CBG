package com.inc.eva.cbg.network.repository

import com.inc.eva.cbg.network.entity.Category
import com.inc.eva.cbg.network.entity.movies.Movies

interface RemoteRepository {
    suspend fun getCategories(): List<Category>

    suspend fun getMoviesByCategory(categories: Array<String>): Movies
}
