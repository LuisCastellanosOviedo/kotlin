package edu.datatypes

import edu.datatypes.javacode.DummyClass

fun main(args: Array<String>) {
    val myInt = 22
    println("default datype is ${myInt is Int}")
    var myLong :Long = 22L


    // error ! not supported  myLong = myInt

    myLong = myInt.toLong()

    val myByte : Byte = 111
    var myShort : Short
    myShort = myByte.toShort()


    val anotherInt = 5

    var myDouble = 65.985
    println(myDouble is Double)

    val myFLoat = 89454.25f
    println("This is a float ${myFLoat is Float}")

    myDouble = myFLoat.toDouble()

    val char : Char = 'b'
    val myCharInt = 65
    println(myCharInt.toChar())

    val myBoolean : Boolean = true
    val falseBoolean = false

    val vacationTime =false
    val onvacation = DummyClass().isVacationTime(vacationTime)

    println("on vavation value $onvacation")

    val anything : Any



}