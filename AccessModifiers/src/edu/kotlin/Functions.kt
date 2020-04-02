package edu.kotlin

fun main(args: Array<String>) {
    println(labelMultiply(3,4,"The result is: "))
    println(whatever())
    println(EmployeeFun("Luis").upperCaseFirstName())
    println(EmployeeFun().upperCaseFirstName())
    printTrucks(Truck("peterbult",1980),Truck("peterbult2",1981),str="string value ")

    val trucks = arrayOf(Truck("peterbult",1980),Truck("peterbult2",1981))
    printTrucks(*trucks,str="string value ")

    val lotsOfTrucks = arrayOf(*trucks,Truck("peterbult",2010))
    printTrucks(*lotsOfTrucks,str = "value")

    println(Utils().upperFirstAndLast("word"))
    println("word using extension function".upperFirstAndLast())

}

fun String.upperFirstAndLast():String{
    val upperFirst = this.substring(0,1).toUpperCase() + this.substring(1)
    return upperFirst.substring(0,upperFirst.length-1)+ upperFirst.substring(upperFirst.length-1,upperFirst.length).toUpperCase()
}

/* large version
fun labelMultiply(operand:Int,operand2:Int,lable:String):String{
    return (" $lable  ${operand + operand2}")
}
*/
fun labelMultiply(operand:Int,operand2:Int,lable:String)= (" $lable  ${operand + operand2}")
 fun whatever () = 3*4

class EmployeeFun (val firstName :String = "Value by default "){
    fun upperCaseFirstName() = firstName.toUpperCase()
}

data class Truck(val color :String , val model :Int)

fun printTrucks(vararg trucks:Truck,str:String="default value"){
    for (truck in trucks){
        println(truck)
    }
}

