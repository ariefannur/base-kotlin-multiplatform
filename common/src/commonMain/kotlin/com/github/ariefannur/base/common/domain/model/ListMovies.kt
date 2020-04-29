package com.github.ariefannur.base.common.domain.model

import kotlinx.serialization.Serializable

@Serializable
 data class ListMovies(
    val page: Int,
    val total_results: Int,
    val total_pages: Int,
    val results: List<Movie>
)