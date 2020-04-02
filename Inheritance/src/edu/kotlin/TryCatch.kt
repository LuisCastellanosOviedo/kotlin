package edu.kotlin

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main(args: Array<String>) {
    println(getNumber("22"))
    println(getNumber("22.5"))
    println(getNumberElvis("22.5")?:throw IllegalArgumentException("number is not an Int"))
}

fun getNumber(str:String):Int{
    return try {
        Integer.parseInt(str)
    }catch (e : NumberFormatException){
        0
    }finally {
        println("im in the finally block")
        1//,-- unused code !
    }
}

fun getNumberElvis(str:String):Int?{
    return try {
        Integer.parseInt(str)
    }catch (e : NumberFormatException){
        null
    }finally {
        println("im in the finally block")
        1//,-- unused code !
    }
}