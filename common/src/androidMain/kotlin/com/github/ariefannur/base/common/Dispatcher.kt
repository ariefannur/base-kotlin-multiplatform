package com.github.ariefannur.base.common

import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

internal actual val ApplicationDispatcher: CoroutineContext = Dispatchers.Default