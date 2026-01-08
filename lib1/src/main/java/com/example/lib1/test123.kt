package com.example.lib1

fun main() {
    val test1 = Testing()
    test1.test(5)
    test1.test(value = "Hello")
    test1.test(value1 = 10, value2 = "hi")


}
class Testing() {


    fun test(value: Int) {
        println("Int: $value")
    }

    fun test(value: String) {
        println("String: $value")
    }

    fun test(value1: Int, value2: String) {
        println("Int: $value1, String: $value2")
    }
}