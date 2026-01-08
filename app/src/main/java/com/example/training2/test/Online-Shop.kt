package com.example.training2.test

open class Product(val id: Int, val name: String, val price: Double) {
    open fun getInfo(): String {
        return "Product(id=$id, name=$name, price=$price)"
    }

}

class FoodProduct(val expirationDays: Int, id: Int, name: String, price: Double) : Product(id, name, price), Discountable{
    override fun getInfo(): String {
        return "FoodProduct(name=$name, price=$price, expires in $expirationDays days)"
    }
    override fun applyDiscount(percent: Int): Double {
        return price * (100 - percent) / 100.0
    }
}

class TechProduct(val warrantyYears: Int, id: Int, name: String, price: Double) : Product(id, name, price) {
    override fun getInfo(): String {
        return "TechProduct(name=$name, price=$price, warranty=$warrantyYears years)"
    }
}

interface Discountable {
    fun applyDiscount(percent: Int): Double
}

class Cart() {
    private val items: MutableList<Product> = mutableListOf()

    fun addProduct(product: Product) {
        items.add(product)
    }

    fun printReceipt() {
        println("==receipt==")

        for (item in items) {
            val type = when (item) {
                is FoodProduct -> "food"
                is TechProduct -> "tech"
                else -> "unknown"
            }
            val finalPrice = if (item is Discountable) {
                item.applyDiscount(20)
            } else {
                item.price
            }
            println("$type | ${item.getInfo()} | Final price: $finalPrice")
        }
        println("===========")
    }
}

fun main() {
    val apple = FoodProduct(id = 1, name = "Green apple", price = 10.5, expirationDays = 6)
    val meat = FoodProduct(id = 3, name = "Steak", price = 22.7, expirationDays = 7)
    val computer = TechProduct(id = 21, name = "macbook", price = 350.50, warrantyYears = 2)
    val smartphone = TechProduct(id = 45, name = "samsung", price = 120.30, warrantyYears = 2)

    val cart = Cart()
    cart.addProduct(apple)
    cart.addProduct(meat)
    cart.addProduct(computer)
    cart.addProduct(smartphone)

    cart.printReceipt()
}





