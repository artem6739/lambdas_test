package com.example.training2.collections

fun main() {
    val chessFigure = ChessFigure()
    val chessQueen = ChessQueen()
    chessQueen.move()
    chessFigure.move()

}

fun getHi(name: String): String {
    return "Hi, name1"
}

open class ChessFigure {
    open fun move() {
        println("figure is moving")
    }



}

 class ChessQueen : ChessFigure() {

 }


