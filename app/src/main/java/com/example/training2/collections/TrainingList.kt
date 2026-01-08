package com.example.training2.collections

fun main() {

    val number = listOf(3, 7, 5, 8, 2, 10, 12, 11)
    val result = evenNumbers(number)
    println()

    val numbers = listOf(3, 7, 2, 9, 1, 6, 4, 8)
    val result2 = checkNumbers(numbers)
    println()

    val Set1 = setOf(1, 2, 3, 4, 5)
    val Set2 = setOf(4, 5, 6, 7, 8)
    val result3 = matchingNumbers(Set1, Set2)
    println()

    val Set3 = setOf(1, 2, 3, 4, 5)
    val Set4 = setOf(4, 5, 6, 7, 8)
    val result4 = uniqueNumbers(Set3, Set4)
}

fun evenNumbers(number: List<Int>) {
    for (i in number)
        if (i % 2 == 0)
            println(i)
}

fun checkNumbers(numbers: List<Int>) {
    for (i in numbers)
        if (i > 5)
            println(i)
}

fun matchingNumbers(Set1: Set<Int>, Set2: Set<Int>) {
    val result = Set1 intersect Set2
    println(result)



}

fun uniqueNumbers(Set1: Set<Int>, Set2: Set<Int>) {
    val result = (Set1 union Set2) subtract (Set1 intersect Set2)
    println(result)
}