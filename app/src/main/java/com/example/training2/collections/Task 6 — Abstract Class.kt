package com.example.training2.collections

abstract class Animal {
    abstract fun move()



}

class Dog : Animal() {
    override fun move() {
 println("Running")
    }
}

class Cat : Animal() {
    override fun move() {
    println("Sneaking")
    }
}

fun main() {
    val animals : List<Animal> = listOf(Dog(), Cat())
    for (animal in animals)
        animal.move()
}

