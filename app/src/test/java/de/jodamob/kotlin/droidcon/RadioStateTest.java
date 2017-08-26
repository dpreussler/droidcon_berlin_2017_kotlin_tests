package de.jodamob.kotlin.droidcon;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class RadioStateTest {

    @Test
    public void should_be_off() {
        RadioState tested = RadioState.ALL_OFF;
        assertFalse(tested.isCellularNetworkConnected());
        assertFalse(tested.isWifiNetworkConnected());
    }
}