package edu.kotlin

fun main(args: Array<String>) {
    for (i in 5..5000 step 5){
        //println(i)
    }

    for (i in -500..0){
        //println(i)
    }

    var total : Int
    var secondToLast =0
    var last = 1

    println(secondToLast)
    println(last)
    for (i in 1..13){
        total = secondToLast + last
        //    println(total)
        secondToLast=last
        last=total
    }

    val num = 101
    val dnum = when {
        num > 100 -> 22255.55
        num < 100 -> 4444.555
        else -> 0
    }
    println(dnum)

}