package edu.challenge1

fun main(args: Array<String>) {
    val hello1 = "Hello"
    val hello2 = "Hello"

    println("Hello 1 is referencially equal to hello2 : ${hello1 === hello2}")


    // test for structural equal
    println("Hello 1 is structurally equal to hello2 : ${hello1 == hello2}")

    //build mutable
    var value = 2986

    // declae immutabe variable of type ANY
    val tmp :Any = "The any type iis th root bla bla "
    if (tmp is String){
        println(tmp.toUpperCase())
    }

    // using one line and idented

    println("""1
        |11
        |11
        |111
        |1111
        |11111
        |111111
    """.trimMargin("|"))



}