package com.github.ariefannur.base.common.domain.usecase

import com.github.ariefannur.base.common.base.BaseResponse
import com.github.ariefannur.base.common.base.BaseUseCase
import com.github.ariefannur.base.common.domain.model.Movie
import com.github.ariefannur.base.common.domain.request.GetDetailMovieRequest
import com.github.ariefannur.base.common.repository.AbstractMovieRepository

class GetDetailMovie(private val repository: AbstractMovieRepository): BaseUseCase<GetDetailMovieRequest, Movie>() {
    override suspend fun run(): BaseResponse<Movie> {
        return repository.getDetailMovie(request?.id ?: 0)
    }

}