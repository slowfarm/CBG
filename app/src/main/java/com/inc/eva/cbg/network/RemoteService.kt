package com.inc.eva.cbg.network

import com.inc.eva.cbg.network.entity.Category
import com.inc.eva.cbg.network.entity.movies.Movies
import retrofit2.http.GET
import retrofit2.http.Query

interface RemoteService {
    @GET("/v1/movie/possible-values-by-field?field=genres.name")
    suspend fun getCategories(): List<Category>

    @GET("/v1.4/movie?page=1&limit=10")
    suspend fun getMovies(
        @Query("genres.name") categories: Array<String>,
    ): Movies
}
