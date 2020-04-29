package com.github.ariefannur.base.common.repository

import com.github.ariefannur.base.common.base.BaseResponse
import com.github.ariefannur.base.common.domain.model.ListMovies
import com.github.ariefannur.base.common.domain.model.Movie

interface AbstractMovieRepository {
    suspend fun getPopularMovie(): BaseResponse<ListMovies>
    suspend fun getDetailMovie(id: Int): BaseResponse<Movie>
}