package com.github.ariefannur.base.common.datasource.remote

import com.github.ariefannur.base.common.base.BaseResponse
import com.github.ariefannur.base.common.domain.model.Movie

interface MovieRemoteDataSource {

    suspend fun getPopularMovie(): BaseResponse<List<Movie>>
    suspend fun getDetailMovie(id: Int): BaseResponse<Movie>

}