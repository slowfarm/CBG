package com.inc.eva.cbg.network.entity.movies

import com.google.gson.annotations.SerializedName

data class Names(
    @SerializedName("name")
    val name: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("type")
    val type: String,
)
