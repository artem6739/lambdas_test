package com.example.training2.collections


fun main() {
    val company = Company()
    val number = 1

    val name1 = Employee("Alex")
    name1.name = "Artem"
    val name2 = Manager("Andrew", bonus = 2000.0)
    val name3 = Employee("Islam")

    company.addEmployee(name1)
    company.addEmployee(name2)
    company.addEmployee(name3)

    company.payAllSalaries(10000.0)


}

interface Payable {
    fun pay(amount: Double)
}

open class Employee(var name: String) : Payable {
    override fun pay(amount: Double) {
        println("$name get payed: $amount$")
    }

    fun pay1(amount: Double) {
        println("com/example/training2/test")
    }
}

class Manager(name: String, private val bonus: Double) : Employee(name) {
    override fun pay(amount: Double) {
        val all = amount + bonus
        println("$name get payed with bonus $all$")
    }
}

class Company {
    private val employees = mutableListOf<Employee>()

    fun addEmployee(employee: Employee) {
        employees.add(employee)
    }

    fun payAllSalaries(amount: Double) {
        for (employee in employees) {
            employee.pay(amount)
        }
    }
}




