package de.jodamob.kotlin.droidcon.c


import junit.framework.Assert.assertEquals
import org.junit.Test

class AwesomeParserTest {

    val tested = AwesomeParser()
    val jsonText = """
    {
        "channels":{
            "BOOKING":1443439538,
            "GTG":1443439537
        }
    }"""

    @Test
    fun `should parse`() {
        assertEquals(1443439538, jsonText.parseAsInt("BOOKING"))
    }

    private fun String.parseAsInt(key: String) =
        tested.getAsInt(key)

    private fun AwesomeParser.getAsInt(key: String) =
        parse(jsonText).getAsInt(key)

    private fun Map<String, Int>.getAsInt(key: String) =
        this[key]!!.toInt()

}
