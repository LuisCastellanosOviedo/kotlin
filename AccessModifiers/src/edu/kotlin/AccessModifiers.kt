package edu.kotlin

val MY_CONSTANT = 100





fun main(args: Array<String>) {
    println(MY_CONSTANT)

    val home = House()

    val employee1 = Employee("luis")
    println(employee1)

    val emp2 = Employee("Joe",true)
    println(emp2.firstname)
    println(emp2.fullTime)


    println("CAR DATA CLASS")

    val car = Car("blue","toyota",2015)
    println(car)

    val car2 = Car ("red","renault",2000)

    val car3 = car2.copy()

    val car4 = car2.copy(year =1995)

}


/* primary constructor
class Employee constructor(val fisrtName:String){
  /* one way
    val fisrtName:String

    init{
        this.fisrtName=fisrtName
    }
    */

    //second way without val after constructor
   // val firstName :String = fisrtName;

}

*/

/* long constructor
class Employee (val firstName:String){
    var fullTime:Boolean = false
    constructor(firstName:String , fullTime:Boolean):this(firstName){
        this.fullTime=fullTime
    }
}
*/

data class Car(val color:String , val model :String , val year:Int){

}
class Employee (val firstname : String ,  val fullTime :Boolean=false)
private class House{

}