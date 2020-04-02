package edu.kotlin

fun main(args: Array<String>) {
    val num = 100

    when(num){
        100,600 -> println("600")
        in 200..299 -> println("200")
        300 -> println("300")
        else -> println("Doesn't match anything")
    }

    val y = 10

    when(y){
        y +80 -> println("90")
        y + 90 -> println("100")
        300 -> println("300")
        else -> println("Doesn't match anything")
    }

    when{
        num< 20 -> println("branch 1")
        num > 20 -> println("branch 2")
        else -> println("else branch")
    }
}