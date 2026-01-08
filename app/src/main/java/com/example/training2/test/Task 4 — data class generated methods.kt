package com.example.training2.test

data class Employee(val name: String, val classID: String)

fun main() {
    val e1 = Employee("Michael", "A" )
    val e2 = Employee("Michael", "A")

    println("e1 == e2: ${e1 == e2}")
    println("e1 === e2: ${e1 === e2}")

    val p1 = Pencil(13, 1)
    val p2 = Pencil(13, 1)

    println("p1 == p2: ${p1 == p2}")
    println(p1.toString())
}

        /*
    val set = HashSet<Employee>()

        set.add(e1)
        println("HashSet contains e2: ${set.contains(e2)}")

}

         */

        class Pencil(val height: Int, val width: Int) {

        }
