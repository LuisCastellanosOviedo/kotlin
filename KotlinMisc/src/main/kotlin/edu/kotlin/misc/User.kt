package edu.kotlin.misc

data class User(val name:String, val id : Int ) {
    fun buildUser() = User("luis",8985)
}