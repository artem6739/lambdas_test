package com.example.training2.collections

class User(
    var name: String,
    var age: Int

)
{
    fun greet() {
        println("Hello, my name is $name, Im $age years old")
    }
}

fun main() {
    val person1 = User("Anton", 34)
    val person2 = User("Mikey", 20)
    person1.greet()
    person2.greet()
}