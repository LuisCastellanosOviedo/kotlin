package edu.datatypes

fun main(args: Array<String>) {

    val float1 = -3578.358f
    val float2 : Float =-3578.358f

    val float3 : Float? = -3578.358f
    val float4 : Float? =-3578.358f


    val arryaOfShorts = shortArrayOf(1,2,3,4,5)
    val shortArray2 : Array<Short> = arrayOf(1,2,3,4,5)

    val arrayNullableBy5 = Array<Int?>(40){i -> (i+1)*5}


    val charArray = charArrayOf('a','b','c')

    val x:String? = "I AM UPPERCASE "

    val z = x?.toLowerCase()?:"I give up "
    println(z)

    x?.let { it.toLowerCase()
        .replace("am","am not") }

    val myNonNullavlue : Int? = null
    myNonNullavlue!!.toDouble()








}