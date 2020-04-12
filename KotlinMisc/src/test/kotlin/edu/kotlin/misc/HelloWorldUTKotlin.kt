package edu.kotlin.misc

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HelloWorldUTKotlin{

    val hellow = HelloWorld()

    @Test
    fun shouldReturnStringHelloWorld() {
        Assertions.assertEquals("Hello World",hellow.buildHelloMessage())
    }
}