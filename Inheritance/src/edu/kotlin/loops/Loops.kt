package edu.kotlin.loops

fun main(args: Array<String>) {
    val range = 1..5
    for (i in range){
        println(i)
    }

    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ"

    val str = "Hello"
    for (c in str){
        println(c)
    }

    for (i in 20 downTo 10 step 5){
        println("i in 20 downTo 10 step 5 $i")
    }

    for (i in 1 until 10){
        println("i in 1 until 10 $i")
    }

    for (num in 1..20 step 4){
        println(" 1 to 20 step 4 $num")
    }

    println(3 in range)
    println('q' in charRange)

    val backwardRange = 5.downTo(1)
    println(5 in backwardRange)

    val stepRange = 3..15
    for (n in stepRange){
        println(n)
    }

    val stepThree = stepRange.step(3)
    val reverseRange = range.reversed()

    println("*****************************************************")

    val seasons = arrayOf("spring","summer","winter","fall")
    for (sea in seasons){
        println(sea)
    }

    for (index in seasons.indices){
        println("${seasons[index]} is season number $index")
    }

    seasons.forEach { println(it) }
    seasons.forEachIndexed{index,value -> "${seasons[index]} is season number $index"}


    val notSeason = "whatever" !in seasons
    println(" notSeason $notSeason")

    val notRange = 3 !in 1..10
    println("notRange $notRange")

    val strHello = "Hello"
    println('e' in strHello)
    println('e' !in strHello)



}