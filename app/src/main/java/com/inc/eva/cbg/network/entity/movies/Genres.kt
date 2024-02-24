package com.inc.eva.cbg.network.entity.movies

import com.google.gson.annotations.SerializedName

data class Genres(
    @SerializedName("name")
    val name: String,
)
