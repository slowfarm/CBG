package com.inc.eva.cbg.network.entity.movies

import com.google.gson.annotations.SerializedName

data class Logo(
    @SerializedName("url")
    var url: String,
    @SerializedName("previewUrl")
    var previewUrl: String,
)
