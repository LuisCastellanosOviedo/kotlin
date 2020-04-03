package edu.kotlin.lists

fun main(args: Array<String>) {
    val setInts = setOf(1,2,3,4,5)

    println(setInts.filter { it % 2 !=0})

    val mutableMap = mutableMapOf("jhons car " to Car("green","Toyota",2015),
        "Janes car" to Car("green","Toyota",2015))

    mutableMap.filter { it.value.color == "silver" }
    println("the filters map is $mutableMap ")

    val ints = arrayOf(1,2,3,4,5)
    val add2List : MutableList<Int> = mutableListOf()
    for (i in ints){
        add2List.add(i +10)
    }

    println(add2List)

    val addValuesList = ints.map {it + 20}
    println(addValuesList)

    val yarsCars = mutableMap.asSequence().map { it.value.year }
    yarsCars.asSequence().forEach { println(it) }

    println(mutableMap.toSortedMap())


}