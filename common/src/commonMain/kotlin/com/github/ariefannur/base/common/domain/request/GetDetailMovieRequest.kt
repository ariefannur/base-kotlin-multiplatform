package com.github.ariefannur.base.common.domain.request

import com.github.ariefannur.base.common.base.BaseRequest

class GetDetailMovieRequest(val id: Int): BaseRequest {
    override fun validate(): Boolean = true

}