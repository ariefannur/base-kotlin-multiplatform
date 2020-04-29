package com.github.ariefannur.base.common.domain.usecase

import com.github.ariefannur.base.common.base.BaseResponse
import com.github.ariefannur.base.common.base.BaseUseCase
import com.github.ariefannur.base.common.domain.model.ListMovies
import com.github.ariefannur.base.common.domain.request.GetPopularRequest
import com.github.ariefannur.base.common.repository.AbstractMovieRepository

class GetPopularMovie(private val repository: AbstractMovieRepository) : BaseUseCase<GetPopularRequest, ListMovies>() {
    override suspend fun run(): BaseResponse<ListMovies> {
       return repository.getPopularMovie()
    }
}