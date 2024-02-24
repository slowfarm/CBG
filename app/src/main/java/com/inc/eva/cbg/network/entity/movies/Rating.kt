package com.inc.eva.cbg.network.entity.movies

import com.google.gson.annotations.SerializedName

data class Rating(
    @SerializedName("kp")
    val kp: Double,
    @SerializedName("imdb")
    val imdb: Double,
    @SerializedName("filmCritics")
    val filmCritics: Double,
    @SerializedName("russianFilmCritics")
    val russianFilmCritics: Double,
    @SerializedName("await")
    val await: String
)