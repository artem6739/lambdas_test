package com.example.training2.collections

data class Player(var name: String, var score: Int) {

}

/*
fun main() {
    val player1 = Player("Scott", 85)
    val player2 = player1.copy(score = 500, name = "Anton")

    player2.score = 500
    player2.name = "Anton"

    println(player1.name)
    println(player1.score)

    println(player2.name)
    println(player2.score)
}

 */

interface Flying {
    fun fly()
}

interface Moveable {
    fun move()
}

class Bird : Flying, Moveable {
    override fun fly() {
    println("bird is flying")
    }
    override fun move() {
        println("bird is moving")
    }
}

class FrostBird : Flying, Moveable {
    override fun fly() {
        println("frostbird is flying")
    }
    override fun move() {
        println("frostbird is moving")
    }

}



fun main() {
    val Bird1 = Bird()
    Bird1.fly()
    Bird1.move()

    val Bird2 = FrostBird()
    Bird2.fly()
    Bird2.move()
}



