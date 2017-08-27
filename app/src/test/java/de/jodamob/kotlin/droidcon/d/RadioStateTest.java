package de.jodamob.kotlin.droidcon.d;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class RadioStateTest {

    @Test
    public void should_calculate_strengths() {

        Map<RadioState.SignalTypes, Integer> signalStrength = new HashMap<>();
        signalStrength.put(RadioState.SignalTypes.EDGE, 90);
        signalStrength.put(RadioState.SignalTypes.WIFI, 0);

        assertTrue(RadioState.isSignalStrongEnough(signalStrength));
    }

    @Test
    public void should_be_off() {
        RadioState tested = RadioState.ALL_OFF;
        assertFalse(tested.isCellularNetworkConnected());
        assertFalse(tested.isWifiNetworkConnected());
    }
}