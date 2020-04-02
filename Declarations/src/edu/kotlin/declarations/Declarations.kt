package edu.kotlin.declarations

typealias EmployeeSet = Set<Employee>


fun practice(){
    var employeeOne = Employee("Mary",1)
    val employeeTwo = Employee("Jhon",2)
    val employeeThree = Employee("Jhon",2)


    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree)
    println(employeeOne === employeeTwo)
    println(employeeTwo === employeeThree)
    println(employeeOne.equals(employeeTwo))
    println(employeeTwo.equals(employeeThree))

    println(employeeOne != employeeTwo)
    println(employeeThree !==  employeeOne)



    val something : Any = employeeThree

    if(something is Employee){
        // explicit NOT NEEDED  KOTLIN IS SMART CAST   val newEmployee =  something as Employee
        // println(newEmployee.name)

        println(something.name)
    }else if(something !is Employee){

    }

/*

    val numInteger : Int = 26
    val number : Int
    number = 10

    // alias instaces
    val employees : EmployeeSet
    val employee1 = Employee("Lynn Jones",500)
    employee1.name="Luiss"

    val employee2 : Employee
    val number2 =100

    if(number < number2){
        employee2 = Employee("luis",400)
    }else{
        employee2 = Employee("Luis 2",150)
    }

    /*-----------------------------------------------*/
  val names = arrayListOf("Jhon","luis")
    print(names[1])

*/


}

fun main(args: Array<String>) {
// String templates

val employee1 = Employee("Lynn",500)
    employee1.name="Luis"

    println(employee1)


    val change = 4.22
    println("show the value of change \$$change")

    println("The employee's id is ${employee1.id}")

    val numerator = 10.99
    val denominator = 20.00

    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    val filePath = """c:/file/documents"""

    val nurseryRhyme = """Humty DUmpty sat on the wall
        |Humpty Dumpty had a great fall
        |bla bla bla 
        |hahaha
    """

    println(nurseryRhyme)

    val eggName ="Humpty"
    val nurseryRhyme2 = """$eggName DUmpty sat on the wall
                       |$eggName Dumpty had a great fall
        |bla bla bla 
        |hahaha
    """.trimMargin("|")

    println(nurseryRhyme2)


}

class Employee (var name:String, val id:Int){



    override fun equals(obj: Any?):Boolean {
        if(obj is Employee){
            return name == obj.name && id == obj.id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}