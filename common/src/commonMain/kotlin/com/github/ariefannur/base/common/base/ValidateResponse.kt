package com.github.ariefannur.base.common.base

inline fun <reified T> validate(response: BaseResponse<T>): T? {
    return when(response) {
        is BaseResponse.Success -> response.data
        else -> null
    }
}