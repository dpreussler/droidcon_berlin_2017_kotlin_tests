package de.jodamob.kotlin.droidcon.d

import de.jodamob.kotlin.droidcon.d.RadioState.SignalTypes.EDGE
import de.jodamob.kotlin.droidcon.d.RadioState.SignalTypes.WIFI
import junit.framework.Assert.assertTrue
import org.junit.Test

class RadioState1Test {

    @Test
    fun should_calculate_strengths() {

        val signalStrength = mapOf(EDGE to 90, WIFI to 0)
        assertTrue(RadioState.isSignalStrongEnough(signalStrength))
    }
}