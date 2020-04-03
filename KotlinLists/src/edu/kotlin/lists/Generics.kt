package edu.kotlin.lists

fun main(args: Array<String>) {
    val list = mutableListOf("String")
    list.printColle()

}

fun printCollection(collection: List<String>){
    for (item in collection){
        println(item )
    }
}

fun <T> List<T>.printColle(){
    for (item in this){
        println(item)
    }
}