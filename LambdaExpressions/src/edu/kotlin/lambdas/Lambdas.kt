package edu.kotlin.lambdas

fun main(args: Array<String>) {
    run { println("im in na lambda")}
    val employees = listOf(Employee("luis","ovie",2012),
        Employee("john","doe",2015),
        Employee("liss","johnson",2010),
        Employee("mary","Jones",2014))

    println("employees min year ${employees.minBy { emp -> emp.startYear }}")
    println("employees min year ${employees.minBy { it.startYear }}")
    println("employees min year ${employees.minBy( Employee::startYear )}")

    var num = 10
    run{
        num+=15
        println(num)
    }

    run(::topLevel)
}

fun topLevel () = println(" im in a toplevel function")
fun userParameter (employees: List<Employee>,num :Int){
    employees.forEach{
        println(it.firstname)
        println(num)
    }
}

data class Employee (val firstname:String,val lastname : String,val startYear : Int)