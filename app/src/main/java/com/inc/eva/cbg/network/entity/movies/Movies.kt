package com.inc.eva.cbg.network.entity.movies

import com.google.gson.annotations.SerializedName

data class Movies(
    @SerializedName("docs")
    val docs: List<Docs>,
    @SerializedName("total")
    val total: Int,
    @SerializedName("limit")
    val limit: Int,
    @SerializedName("page")
    val page: Int,
    @SerializedName("pages")
    val pages: Int,
)
