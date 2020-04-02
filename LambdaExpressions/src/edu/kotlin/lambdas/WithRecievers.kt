package edu.kotlin.lambdas

import java.lang.StringBuilder

fun main(args: Array<String>) {
    println(countTo100())
    println(countTo100RefactorUsingWith())
    println(countTo100RefactorUsingApply())



    val employees2 = listOf(Employee2("luis","ovie",2012),
        Employee2("john","doe",2015),
        Employee2("liss","johnson",2010),
        Employee2("mary","Jones",2014))

    println(findByLastname(employees2,"jones"))

    "some string".apply someString@{
        "Another string ".apply {
            println(toLowerCase())
            println(this@someString.toUpperCase())
        }

    }


}

fun findByLastname(employees:List<Employee2> ,lastname: String): String? {
    return employees.asSequence()
        .find { it.lastname.toUpperCase() == lastname.toUpperCase() }?.
            lastname?:"Default"
}


fun countTo100():String {
    val numbers = StringBuilder()
    for(i in 1..99){
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}

fun countTo100RefactorUsingWith():String =
    with(StringBuilder()){
        for(i in 1..99){
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }

fun countTo100RefactorUsingApply():String =
    StringBuilder().apply(){
        for(i in 1..99){
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }.toString()


data class Employee2 (val firstname:String,val lastname : String,val startYear : Int)