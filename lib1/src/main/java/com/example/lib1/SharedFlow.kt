package com.example.lib1

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {

val sharedFlow = MutableSharedFlow<Long>()

    launch {
        while (true) {
            val time = System.currentTimeMillis()
            println("Emitting: $time")
            sharedFlow.emit(time)
            delay(1000)
        }
    }

    launch {
        sharedFlow.collect {
            println("Collector 1 received: $it")
        }
    }

    delay(2000)

    launch {
        sharedFlow.collect {
            println("Collector 2 received: $it")
        }
    }

    delay(5000)
    println("RunBlocking finished")
}