package de.jodamob.kotlin.droidcon.a

import org.junit.Test

class ImportantClassDoingSomethingTest {

    val tested = ImportantClassDoingSomething()

    @Test
    fun `handles null arguments`() {
        tested.makeItHappen(null)
    }

}