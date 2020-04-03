package edu.kotlin.lists

fun main(args: Array<String>) {

    val strings = listOf("spring","summer","fall","winter")
    val colorList = listOf("black","white","red")
    val mutableSeassons = strings.toMutableList()
    mutableSeassons.add("new seasson")
    println(mutableSeassons)


    println(strings.last())
    println(strings.reversed())
    println(strings.getOrNull(5))

    val ints = listOf(1,2,3,4)
    println(ints.max())

    println(colorList.zip(strings))

    val mergeList = listOf(colorList,strings)
    println(mergeList)

    val combinedList = colorList+strings
    println(combinedList)

    val noDupsList = colorList.union(strings)
    println(noDupsList)

    println(colorList.distinct())

}