package edu.kotlin.misc

import edu.kotlin.misc.util.UserTestData
import io.mockk.MockK
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.api.TestInstance
import org.hamcrest.MatcherAssert.assertThat
import  org.hamcrest.Matchers.`is`

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UserTestMockK{

    private val userMock : User = mockk();

    init {
        every { userMock.buildUser() } returns User("luis",8985)
    }

    @Test
    internal fun shouldReturnUserTest() {
        Assertions.assertEquals(User("luis",8985).id,userMock.buildUser().id)
        Assertions.assertEquals(User("luis",8985).name,userMock.buildUser().name)
        assertThat(User("luis",8985), `is`(userMock.buildUser()))
        verify { userMock.buildUser()  }

        // alternative verifySequence
    }

    @ParameterizedTest
    @MethodSource("validTokenProvider")
    internal fun testUserParametrized(data :UserTestData) {
        Assertions.assertEquals(data.inputid,data.expectedId)
        Assertions.assertEquals(data.inputName,data.expectedName)
    }

    private fun validTokenProvider()= sequenceOf(
            UserTestData("luis",1,"luis",1),
            UserTestData("james",2,"james",2)
    ).toList()

}