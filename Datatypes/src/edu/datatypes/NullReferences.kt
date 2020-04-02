package edu.datatypes

fun main(args: Array<String>) {
    val str: String? = "this inst null"
    if(str != null){
        str.toUpperCase()
    }

    str?.toUpperCase()

    // HOW TO AVOID NESTED IF NULL
    //val countryCode : String? = bankBranch?.address?.country?.countryCode

    val nullValue: String ? =null
    val str2 = nullValue ?: "this is the default value "
    println(str2)

    val something : Any = arrayOf(1,2,3)
    val str3 = something as? String
    println("Safe cast example ${str3}")

    // si es nulllanza excp !! estoy 100% seguro
    val str4:String? = "never will be null"
    val str5 = str4!!.toUpperCase()

    // call functions not null use of let !!!
    val meesageNullable : String? = "This isn't null"
    meesageNullable?.let { printText(it) }

    //equals is a safe operator
    val valuenull = null
    val stringTmp = "value nt null"
    println(valuenull == stringTmp) //<-- no se rompe es safe


    val nullableInts = arrayOfNulls<Int?>(5)
    for (i in nullableInts){
        println(i)
    }



}

fun printText(text :String){
    println(text)
}