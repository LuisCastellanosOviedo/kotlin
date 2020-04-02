package edu.kotlin.inheritance

import java.time.Year

fun main(args: Array<String>) {

    println(DepartMent.ACCOUNTING.getDeptInfo())
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
    println(SomeClass.Companion.accessprivateVar())
    val someClass1 = SomeClass.justAssign("String as is ")
    val someClass2 = SomeClass.upperOrLower("String as upper ",false)
    println(someClass1.someThing)
    println(someClass2.someThing)

    var thisIsMutable = 45
    wantsSomeInterface(object :SomeInterface{
        override fun mustImplement(num: Int): String {
            thisIsMutable++
            return "this is must implemented ${num * 100}"
        }
    } )
}
fun topLevel(str:String)= println("top level function $str")
enum class DepartMent(val fullName:String , val numEmployees:Int){
    HR("human r",5)
    ,IT("info technology",10),
    ACCOUNTING("accounting",550)
    ,SALES("sales",2000);

    fun getDeptInfo()="the $fullName department has $numEmployees employees"
}

object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "our company rocks !"
    fun getCopyrightLine() = "Copyright  $currentYear Our company all right reserved"
}

class SomeClass private constructor(val someThing:String){

    /* s necesario crear instacia para acceder
    private val privateVar =6

    fun accessprivateVar(){
        println("accesing private var $privateVar")
    }
     */

    companion object {
        private val privateVar =6
        fun accessprivateVar() = "accesing private var $privateVar"

        fun justAssign(str: String)=SomeClass(str)
        fun upperOrLower(str: String,lowercase: Boolean):SomeClass{
            if(lowercase){
                return SomeClass(str.toLowerCase())
            }else{
                return SomeClass(str.toUpperCase())
            }
        }
    }
}

interface SomeInterface{
    fun mustImplement(num:Int):String
}

fun wantsSomeInterface(si:SomeInterface){
    println("printing from wantsSomeInterface  ${si.mustImplement(22)}")
}