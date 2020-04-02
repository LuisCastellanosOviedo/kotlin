package edu.kotlin.lambdas

fun main(args: Array<String>) {
    val strings = listOf("spring","summer","fall","winter")
    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    val notNullList = listOfNotNull("hello",null,"goodbye")
    notNullList.asSequence().forEach { println(it) }

    val mutableListTmmp = mutableListOf<Int>(1,2,3)
    println(mutableListTmmp.javaClass)

    val array = arrayOf("black","white","green")
    val colorList = listOf(*array)
    println(colorList)

    val ints = intArrayOf(1,2,3)
    println(ints.toList())
}