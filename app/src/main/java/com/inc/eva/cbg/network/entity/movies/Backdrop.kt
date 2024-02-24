package com.inc.eva.cbg.network.entity.movies

import com.google.gson.annotations.SerializedName

data class Backdrop(
    @SerializedName("url")
    val url: String,
    @SerializedName("previewUrl")
    val previewUrl: String,
)
