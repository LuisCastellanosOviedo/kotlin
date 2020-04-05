package edu.kotlin.lists

fun main(args: Array<String>) {

    val shortList : List<Short> = listOf(1,2,3,4,5)
    //convertToint(shortList)
}

fun convertToint(collection : MutableList<Number>){
    for (num in collection){
        println("${num.toInt()}")
    }
}

fun tendGarden(rosegarden:Garden<Rose>){
    // error if not added out opisition
    waterGarden(rosegarden)
}

fun waterGarden(garden:Garden<Flower>){

}

open class Flower{

}
class Rose :Flower(){

}
class Garden<out T:Flower> {
    val flowers: List<T> = listOf()
    fun pickFLower(i:Int):T = flowers[i]
    // error due to out position --> fun plantFlower(flower:T)
}