package com.example.training2.test

import kotlin.Int

data class User(val id: Int, val name: String, val email: String?, val age: Int) {

}

open class UserManager() {

    private val users: MutableList<User> = mutableListOf()

    fun addUser(user: User) {
        users.add(user)
    }

    fun findUserById(id: Int): User? {
        return users.find { it.id == id }
    }

    private fun ageCategory(age: Int): String {
        return when (age) {
            in 0 ..18 -> "Child"
            in 18..64 -> "Adult"
            else -> "Senior"
        }
    }

    fun printAllUsers() {
        for (user in users) {
            val emailFail = user.email ?: "No email"
            val category = ageCategory(user.age)
            println("ID: ${user.id}, Name: ${user.name}, Email: $emailFail, Age: ${user.age}, Category: $category")
        }
    }

    companion object {
        private var nextId = 1764
        fun randomId(): Int {
            return nextId++
        }
    }
}

fun main() {
    val manager = UserManager()

    val user1 = User(id = UserManager.randomId(), name = "Alex", email = "alexworker@gmail.com", age = 22)
    val user2 = User(id = UserManager.randomId(), name = "John", email = "john@gmail.com", age = 35)
    val user3 = User(id = UserManager.randomId(), name = "Artem", email = null,  age = 17)

    manager.addUser(user1)
    manager.addUser(user2)
    manager.addUser(user3)

    val foundUser = manager.findUserById(1)
    println("Found user: $foundUser")

    println("\nAll users:")
    manager.printAllUsers()
}

