package de.jodamob.kotlin.droidcon.b

import org.amshove.kluent.`with message`
import org.amshove.kluent.shouldThrow
import org.junit.Test


class ImportantClassCheckingSomethingTest {

    @Test
    fun should_throw_if_empty() {
        val tested = ImportantClassCheckingSomething()
        val function = {tested.dontletItHappen("")}

        function shouldThrow IllegalArgumentException::class `with message` "was empty"
    }
}