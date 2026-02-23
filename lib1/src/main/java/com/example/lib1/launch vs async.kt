package com.example.lib1

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking  {
launch {
    delay(1000)
    println("launch finished")
 }
    println("main continues")

    val result = async {
        delay(1000)
        10 + 32
    }
    println("result = ${result.await()}")


    fun simpleFlow(): Flow<Int> = flow {
        for (i in 1..3) {
            delay(100)
            emit(i)
        }

        }
    simpleFlow().collect { value ->
        println("got $value")
    }

}

