package com.github.ariefannur.base.common.base

import kotlinx.coroutines.channels.Channel

abstract class BaseUseCase<R: BaseRequest, T>() {

    var request: R? = null
    private val channel = Channel<BaseResponse<T>>(Channel.UNLIMITED)

    suspend fun execute(request: R? = null): BaseResponse<T> {
        this.request = request
        return when(request?.validate()) {
            true -> run()
            else  -> BaseResponse.Error("Invalidate error")
        }
    }

    abstract suspend fun run(): BaseResponse<T>
}