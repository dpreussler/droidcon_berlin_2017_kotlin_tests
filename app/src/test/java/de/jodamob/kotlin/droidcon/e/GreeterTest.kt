package de.jodamob.kotlin.droidcon.e

import org.amshove.kluent.`should contain`
import org.amshove.kluent.`should equal`
import org.junit.Test
import kotlin.reflect.KFunction1

class GreeterTest {

    val tested = Greeter()

    @Test
    fun `should greet the conference`() {
        calling {tested::greet} with "Droidcon" `should equal` "Hello Droidcon"
    }

    fun calling(function: () -> KFunction1<String, String>) = function

    infix fun (() -> KFunction1<String, String>).with(argument : String) : String =
        invoke().invoke(argument)

    @Test
    fun should_be_interntional() {
        val greetings = tested.someGreetings
        greetings `should contain` "Hallo"
    }
}

