package com.example.training2.test

open class Point(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Point) return false
        return this.x == other.x && this.y == other.y
    }
    override fun hashCode(): Int {
        return 31 * x + y
    }
    override fun toString(): String = "Point(x=$x, y=$y)"
}

fun main() {
    val point1 = Point(1, 2)
    val point2 = Point(1, 2)

    println(point1 == point2)
    println(point1 === point2)

    val set = HashSet<Point>()
    set.add(point1)
    set.add(point2)

    println(set.size)
    println(set)
}