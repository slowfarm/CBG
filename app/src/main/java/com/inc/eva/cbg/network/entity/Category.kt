package com.inc.eva.cbg.network.entity

import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String,

    val checked: Boolean = false,
)
