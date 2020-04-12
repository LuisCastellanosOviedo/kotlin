package edu.kotlin.misc

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.hamcrest.MatcherAssert.assertThat
import  org.hamcrest.Matchers.`is`


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HelloWorldUTKotlin{

   private val hellow = HelloWorld()

    @Nested
    inner class GetHelloMessages() {
        @Test
        fun shouldReturnStringHelloWorld() {
            Assertions.assertEquals("Hello World",  hellow.buildHelloMessage())
            assertThat("Hello World", `is`(hellow.buildHelloMessage()))
        }
    }

    @Nested
    inner class GetGoodByMessages() {
        @Test
        fun shouldReturnStringHelloWorld() {
            Assertions.assertEquals("Good Bye", hellow.buildGoodByeMessage())
        }
    }
}