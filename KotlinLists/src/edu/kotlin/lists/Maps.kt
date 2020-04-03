package edu.kotlin.lists

fun main(args: Array<String>) {

    val immutableMap = mapOf(1 to Car("green","Toyota",2015),
        1 to Car("red","Ford",2016),
        1 to Car("silver","Honda",2013))

    println(immutableMap.javaClass)
    println(immutableMap)

    val mutableMap = mutableMapOf("jhons car " to Car("green","Toyota",2015),
        "Janes car" to Car("green","Toyota",2015))

    for (entry in mutableMap){
        println(entry.key)
        println(entry.value)
    }

    for ((key,value) in mutableMap){
        println(key)
        println(value)
    }

    println(mutableMap.javaClass)
    println(mutableMap)

    val pair = Pair(10,"ten")
    println(pair.first)
    println(pair.second)
    val (fistrValue , secondValue)=pair
    println(fistrValue)
    println(secondValue)


    val car = Car("blue","Corvette",1959)
    val (color,model,year) = car

    println("color $color model $model year $year")
}
/*
long way no data class
class Car(val color:String, val model:String,val year : Int){
    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year
}*/

// short way
data class Car(val color:String, val model:String,val year : Int)