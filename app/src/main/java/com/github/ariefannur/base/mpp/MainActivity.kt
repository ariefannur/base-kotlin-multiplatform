package com.github.ariefannur.base.mpp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.ariefannur.base.common.base.BaseResponse
import com.github.ariefannur.base.common.datasource.remote.MovieApi
import com.github.ariefannur.base.common.domain.model.ListMovies
import com.github.ariefannur.base.common.domain.request.GetDetailMovieRequest
import com.github.ariefannur.base.common.domain.request.GetPopularRequest
import com.github.ariefannur.base.common.domain.usecase.GetDetailMovie
import com.github.ariefannur.base.common.domain.usecase.GetPopularMovie
import com.github.ariefannur.base.common.repository.MovieRepository
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity() {
    val api = MovieApi()
    val repository = MovieRepository(api)
    val getDetail = GetDetailMovie(repository)
    val getPopular = GetPopularMovie(repository)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val request = GetDetailMovieRequest(233)
        val requestPopular = GetPopularRequest()
        launchSilent(Dispatchers.Default, Job()) {
            getPopular.execute(requestPopular) {
                when (this) {
                    is BaseResponse.Success -> {
                        this@MainActivity.runOnUiThread {
                            tv_main.text = this.data.results[0].original_title
                        }
                        Log.d("AF", "get data ${this.data}")
                    }
                    is BaseResponse.Error -> {
                        Log.d("AF", "error ${this.exception}")
                    }
                    is BaseResponse.Loading -> {
                        this@MainActivity.runOnUiThread {
                            tv_main.text = "loading"
                        }
                    }
                }
            }
        }
    }
}
