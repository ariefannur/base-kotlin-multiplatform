package com.github.ariefannur.base.common.base

import kotlinx.coroutines.channels.Channel

abstract class BaseUseCase<R: BaseRequest, T>() {
    var request: R? = null
    private val channel = Channel<BaseResponse<T>>(Channel.UNLIMITED)

    suspend fun execute(request: R? = null,  callback: BaseResponse<T>.() -> Unit)  {
        this.request = request
        callback.invoke(BaseResponse.Loading())
        when(request?.validate()) {
            true -> callback.invoke(run())
            else  -> callback.invoke(BaseResponse.Error("Invalidate error"))
        }
    }

    abstract suspend fun run(): BaseResponse<T>
}