package com.inc.eva.cbg.network.entity.movies

import com.google.gson.annotations.SerializedName

data class Votes(
    @SerializedName("kp")
    val kp: Int,
    @SerializedName("imdb")
    val imdb: Int,
    @SerializedName("filmCritics")
    val filmCritics: Int,
    @SerializedName("russianFilmCritics")
    val russianFilmCritics: Int,
    @SerializedName("await")
    val await: Int,
)
