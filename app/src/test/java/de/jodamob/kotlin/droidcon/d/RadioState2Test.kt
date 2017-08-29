package de.jodamob.kotlin.droidcon.d

import org.junit.Assert.assertFalse
import org.junit.Test

class RadioState2Test {

    @Test
    fun should_be_off() {
        val tested = RadioState.ALL_OFF
        tested.assertNotOnAnyNetwork()
    }

    private fun RadioState.assertNotOnAnyNetwork() {
        assertFalse(isOnAnyNetwork())
    }

    private fun RadioState.isOnAnyNetwork() : Boolean {
        return isCellularNetworkConnected && isWifiNetworkConnected
    }
}