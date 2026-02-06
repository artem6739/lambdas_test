package com.example.lib1

val numberIsGreaterThanTenTest1: (Int) -> Boolean = { number -> number >= 10 }



fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

val result = calculate(5, 3) { a, b -> a + b }
val result1 = calculate(5, 3) { a, b -> a * b }

val numbers = listOf(3, 7, 10, 15, 2, 8)

val even = numbers.filter { it % 2 == 0 }
val isGreaterThanFive = numbers.filter { it >= 5 }

val words = listOf("kotlin", "java", "compose")
val allWords = words.map { str -> str.uppercase() + "str1"}

fun repeatAction(times: Int, action: () -> Unit) {
    repeat(times) {
        action()
    }
}

fun main() {
    println(numberIsGreaterThanTenTest1(5))
    println(numberIsGreaterThanTenTest1(20))
    println(numberIsGreaterThanTenTest1(10))

    println(result)
    println(result1)

    println(even)
    println(isGreaterThanFive)

    println(allWords)

    repeatAction(6) {
        println("Hello")
    }
}


