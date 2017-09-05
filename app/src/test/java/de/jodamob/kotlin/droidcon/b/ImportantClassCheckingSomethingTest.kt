package de.jodamob.kotlin.droidcon.b

import org.amshove.kluent.`with message`
import org.amshove.kluent.shouldThrow
import org.junit.Test
import kotlin.test.assertFailsWith


class ImportantClassCheckingSomethingTest {

    @Test
    fun `should throw if empty normal version`() {
        val tested = ImportantClassCheckingSomething()
        
        assertFailsWith(IllegalArgumentException::class) {
            tested.dontletItHappen("")
        }
    }

    @Test
    fun `should throw if empty kluent version`() {
        val tested = ImportantClassCheckingSomething()
        val function = {tested.dontletItHappen("")}

        function shouldThrow IllegalArgumentException::class `with message` "was empty"
    }
}