package com.example.training2.test


class Car(name: String, speed: Int) {
    private var ignitionOn: Boolean = true
    private var clutch: Boolean = true
    private var currentGear: Int = 3
    private var brand: String = "Mazda"
    private var speed: Int = speed

    fun showInfo() {
    println("Brand: $brand")
        println("Speed: $speed")
}

    fun speedDial(): String {
        return when (speed) {
            in 0..20 -> "Gear 1: 0-20 km/h"
            in 20..40 -> "Gear 2: 20-40 km/h"
            in 40..60 -> "Gear 3: 40-60 km/h"
            in 60..80 -> "Gear 4: 60-80 km/h"
            in 80..200 -> "Gear 5: 80-90+ km/h"
            else -> "too fast"
        }
    }
    fun startIgnition() {
        ignitionOn = true
        println("Ignition On")
    }

    fun stopIgnition() {
        ignitionOn = false
        println("Ignition Off")
    }

    fun pressClutch() {
        clutch = true
        println("Clutch is pressed")
    }

    fun releaseClutch() {
        clutch = false
        println("Clutch is released")
    }

    fun changeGear(gear: Int) {
        if (!clutch) {
            println("The clutch is not depressed, movement is not possible")
            return
        }
        currentGear = gear
        println("Gear changed to $gear")

    }

    fun drive() {
        if (!ignitionOn) {
            println("Ignition Off")
            return
        }
        if (currentGear == 0) {
            speed == maxOf(0, speed - 5)
            println("Neutral gear, speed $speed")
            return
        }
        if (!clutch) {
            println("The car stalled")
            return
        }
        speed += currentGear * 5
        println("Car is moving on $currentGear gear, speed $speed")
    }
}

fun main() {
   val car = Car("Mazda", 60)
    car.showInfo()
    car.startIgnition()

   car.pressClutch()
    car.changeGear(1)
    car.releaseClutch()

    car.drive()
    println(car.speedDial())
}