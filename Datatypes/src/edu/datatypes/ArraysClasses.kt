package edu.datatypes

import edu.datatypes.javacode.DummyClass
import java.math.BigDecimal

fun main(args: Array<String>) {
    val names = arrayOf("joe","luis","jill")

    val longs1 = arrayOf(1L,2L,3L)
    val longs2 = arrayOf<Long>(1,2,3)

    val evenNumbers = Array(16){i -> i*2}

    for (number in evenNumbers){
        println(number)
    }

    val listOfNumbers = Array(100000){i -> i+1}
    val allZeroes = Array(1000) {0}
    var someArray : Array<Int>
    someArray = arrayOf(1,2,3,4,5)

    for (number in someArray){
        println(number)
    }

    val misxedArray = arrayOf("hello",22,BigDecimal(22),'a')
    println(misxedArray is Array<*>)

    val myIntArray= arrayOf(1,2,3,4,5)
    println("int arrya using java code ")
    DummyClass().printNumbers(myIntArray.toIntArray())

   // not compile !!!!! ------>>>>> var emptyArray = Array<Int>(5)
    var array1 : Array<Int>

    var someOtherArray = IntArray(5)
// empty int array
    for (number in someOtherArray){
        println(number)
    }


    DummyClass().printNumbers(evenNumbers.toIntArray())


    val convertedIntArray  = myIntArray.toIntArray()








}

