package edu.kotlin.lists


fun main(args: Array<String>) {
    val setints = setOf(10,15,19,5,3)
    println(setints.plus(20))
    println(setints.plus(10))
    println(setints.minus(19))
    println(setints.minus(100))
    println(setints.average())
    println(setints.drop(3))

    val mutableInts = mutableSetOf(1,2,3,4,5)
    mutableInts.plus(10)
    println(mutableInts)
}