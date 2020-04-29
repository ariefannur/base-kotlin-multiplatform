package com.github.ariefannur.base.common.base

sealed class BaseResponse<out T> {
    class Success<out T>(val data: T) : BaseResponse<T>()
    class Error(val exception: String) : BaseResponse<Nothing>()
}