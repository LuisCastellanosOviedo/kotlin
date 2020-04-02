package edu.kotlin.inheritance

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("printer ABC",15).printModel()
    SomethingElse("whatever")
}

abstract class Printer(val modelName:String){
    open fun printModel()= println("The model is $modelName")
    abstract fun bestSellingPrice():Double
}

open class LaserPrinter(modelName:String,ppm:Int):Printer(modelName){
    // or define a constructor
    //constructor():super()
    final override fun printModel()= println("The laser model is $modelName")
    override fun bestSellingPrice(): Double = 129.99
}



// ejecucion de varion contructores
open class Something{
    val property :String

    constructor(someParameter:String){
        property=someParameter
        println("parent's constructor")
    }
}

class SomethingElse:Something{
    constructor(someOtherParameter:String):super(someOtherParameter){
        println("I'm in the child constructor")
    }
}

// cannot be extended open + data class --> errors
data class DataClass (val number:Int)

interface MyInterface{
    val number:Int


    // val numberTwo:Int = 50 compiler error
    val numberTwo:Int
        get()=number *100


    fun MyFunction(str:String):String
}

interface MySubInterface :MyInterface{
    fun MySubFucntion(num:Int):String
}

class Implement:MySubInterface{

    override val number:Int =25
    override val numberTwo :Int = 25



    override fun MyFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun MySubFucntion(num: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}