package com.example.lib1

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val result = (1..10).asFlow()
        .filter { it % 2 == 0 }
        .map { it * 10 }
        .take(3)
        .onEach { println("value: $it") }
        .fold(0) { acc, value -> acc + value
        }
    println("Total sum: $result")

}