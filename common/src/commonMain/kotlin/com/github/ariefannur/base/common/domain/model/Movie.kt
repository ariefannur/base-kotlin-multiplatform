package com.github.ariefannur.base.common.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Movie(
    val id: Int,
    val backdrop_path: String,
    val poster_path: String,
    val original_title: String,
    val overview: String,
    val popularity: Float,
    val tagline: String,
    val title: String,
    val release_date: String
) {
    companion object {
        fun init(): Movie {
            return Movie(
                0,
                "",
                "",
                "",
                "",
                0f,
                "",
                "",
                ""
            )
        }
    }
}