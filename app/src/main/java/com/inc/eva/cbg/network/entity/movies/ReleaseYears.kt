package com.inc.eva.cbg.network.entity.movies

import com.google.gson.annotations.SerializedName

data class ReleaseYears(
    @SerializedName("start")
    val start: Int,
    @SerializedName("end")
    val end: Int,
)
