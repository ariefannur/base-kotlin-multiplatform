package com.github.ariefannur.base.common.repository

import com.github.ariefannur.base.common.base.BaseResponse
import com.github.ariefannur.base.common.datasource.remote.MovieRemoteDataSource
import com.github.ariefannur.base.common.domain.model.ListMovies
import com.github.ariefannur.base.common.domain.model.Movie

class MovieRepository(private val remote: MovieRemoteDataSource) : AbstractMovieRepository {
    override suspend fun getPopularMovie(): BaseResponse<ListMovies> {
        return remote.getPopularMovie()
    }

    override suspend fun getDetailMovie(id: Int): BaseResponse<Movie> {
        return remote.getDetailMovie(id)
    }

}