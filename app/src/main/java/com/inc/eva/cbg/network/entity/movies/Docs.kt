package com.inc.eva.cbg.network.entity.movies

import com.google.gson.annotations.SerializedName

data class Docs(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("alternativeName")
    val alternativeName: String,
    @SerializedName("names")
    val names: List<Names>,
    @SerializedName("type")
    val type: String,
    @SerializedName("typeNumber")
    val typeNumber: Int,
    @SerializedName("year")
    val year: Int,
    @SerializedName("description")
    val description: String,
    @SerializedName("shortDescription")
    val shortDescription: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("rating")
    val rating: Rating,
    @SerializedName("votes")
    val votes: Votes,
    @SerializedName("movieLength")
    val movieLength: String,
    @SerializedName("totalSeriesLength")
    val totalSeriesLength: String,
    @SerializedName("seriesLength")
    val seriesLength: Int,
    @SerializedName("ratingMpaa")
    val ratingMpaa: String,
    @SerializedName("ageRating")
    val ageRating: Int,
    @SerializedName("poster")
    val poster: Poster,
    @SerializedName("backdrop")
    val backdrop: Backdrop,
    @SerializedName("genres")
    val genres: List<Genres>,
    @SerializedName("countries")
    val countries: List<Countries>,
    @SerializedName("releaseYears")
    val releaseYears: List<ReleaseYears>,
    @SerializedName("top10")
    val top10: String,
    @SerializedName("top250")
    val top250: Int,
    @SerializedName("isSeries")
    val isSeries: Boolean,
    @SerializedName("ticketsOnSale")
    val ticketsOnSale: Boolean,
    @SerializedName("logo")
    val logo: Logo,
    @SerializedName("enName")
    val enName: String,
)
