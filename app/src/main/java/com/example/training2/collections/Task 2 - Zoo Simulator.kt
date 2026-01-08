package com.example.training2.collections
/*
fun main() {
    val zoo = Zoo()

    zoo.addAnimal(Bird("Kesha", 5))
    zoo.addAnimal(Lion("Simba", 7))

    println("Feeding animals:")
    zoo.feedAll()

    println("Performance:")
    zoo.perform()
}

interface Flyable {
    fun fly()
}

abstract class zooAnimal(
    val name: String,
    val age: Int)
{
    abstract fun eat()
    abstract fun makeSound()
}

class Bird (
    name: String,
    age: Int): zooAnimal(name,age), Flyable
{
    override fun fly() {
        println("Bird is flying")
    }

    override fun eat() {
        println("Bird is eating seeds")
    }

    override fun makeSound() {
        println("Bird chirps")
    }
}

class Lion(
    name: String,
    age: Int): zooAnimal(name,age)
{
    override fun makeSound() {
        println("Lion roars")
    }

    override fun eat() {
        println("Lion is eating meat")
    }
}

class Zoo {
    private val animals = mutableListOf<zooAnimal>()

    fun addAnimal(animal: zooAnimal) {
        animals.add(animal)
    }

    fun feedAll() {
        animals.forEach { it.eat() }
    }

    fun perform() {
        animals.forEach {animal -> animal.makeSound()
            if (animal is Flyable) {
                animal.fly()
            }
        }
    }
}

 */