package edu.kotlin.lists

import java.lang.Appendable
import java.lang.StringBuilder

fun main(args: Array<String>) {
    val inst = listOf(1,2,3,4,5)
    val shorts = listOf<Short> (20,30,40)

    append(StringBuilder("String1"),StringBuilder("String2"))
}

fun <T> convertToInt(collection:List<T>){
    for (num in collection    ){
       // error println("${num.toInt()}")
    }
}

fun <T> append(item:T,item2:T) where T : CharSequence,T:Appendable{
    println("the result is ${item.append(item2)}")
}