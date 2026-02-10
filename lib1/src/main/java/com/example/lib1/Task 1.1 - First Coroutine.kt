package com.example.lib1

import kotlinx.coroutines.*


fun main() = runBlocking {
    println("start")

    launch {
        delay(2000)
        println("inside coroutine")
    }

    println("end")

    println("before delay")

    launch {
        Thread.sleep(2000)

    }
    println("after delay")

    launch {
        delay(5000)
        println("coroutine 1 finished")
    }
    println("coroutine 1.1 finished")

    launch {
        delay(3000)
        println("coroutine 2 finished")
    }
    println("coroutine 2.2 finished")

    launch {
        delay(1000)
        println("coroutine 3 finished")
    }
    println("coroutine 3.3 finished")
    }



