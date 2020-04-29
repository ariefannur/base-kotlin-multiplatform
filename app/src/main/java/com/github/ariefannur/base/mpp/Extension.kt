package com.github.ariefannur.base.mpp

import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

fun AppCompatActivity.launchSilent(
    context: CoroutineContext = Dispatchers.Main,
    job: Job,
    start: CoroutineStart = CoroutineStart.DEFAULT,
    block: suspend CoroutineScope.() -> Unit
) {
    val coroutineScope = CoroutineScope(context + job)
    coroutineScope.launch(context, start, block)
}
