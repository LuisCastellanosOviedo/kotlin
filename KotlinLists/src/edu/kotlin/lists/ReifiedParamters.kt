package edu.kotlin.lists

import java.math.BigDecimal

fun main(args: Array<String>) {

    val mixedList = listOf("string",BigDecimal(1))
    val bigDecimalOnly = getElementsOfType<BigDecimal>(mixedList)
    println(bigDecimalOnly)
}

// only for inline functions
inline fun <reified T> getElementsOfType(list:List<Any>):List<T>{
    var newList : MutableList<T> = mutableListOf()
    for (elem in list){
        if(elem is T){
            newList.add(elem)
        }
    }
    return newList
}

