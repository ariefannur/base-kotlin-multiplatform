package com.github.ariefannur.base.common.datasource.remote

import com.github.ariefannur.base.common.base.BaseResponse
import com.github.ariefannur.base.common.domain.model.ListMovies
import com.github.ariefannur.base.common.domain.model.Movie
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import kotlinx.serialization.ImplicitReflectionSerializer
import kotlinx.serialization.json.Json

class MovieApi : MovieRemoteDataSource {

    private val key = "63406655e9ada6c067362ca5f498dceb"
    private val baseUrl = "https://api.themoviedb.org/3/"
    private val httpClient = HttpClient()

    @ImplicitReflectionSerializer
    override suspend fun getPopularMovie(): BaseResponse<ListMovies> {
        return try {
            val path = "movie/popular"
            val finalUrl = "$baseUrl$path?api_key=$key"
            val json = httpClient.get<String>(finalUrl)
            val response = Json.nonstrict.parse(ListMovies.serializer(), json)
            BaseResponse.Success(response)
        } catch (e: Exception) {
            BaseResponse.Error(e.message ?: "")
        }
    }

    override suspend fun getDetailMovie(id: Int): BaseResponse<Movie> {
        return try {
            val path = "movie/"
            val finalUrl = "$baseUrl$path$id?api_key=$key"
            val json = httpClient.get<String>(finalUrl)
            println("json ::::: $json")
            val response = Json.nonstrict.parse(Movie.serializer(), json)
            BaseResponse.Success(response)
        } catch (e: Exception) {
            BaseResponse.Error(e.message ?: "")
        }
    }


}