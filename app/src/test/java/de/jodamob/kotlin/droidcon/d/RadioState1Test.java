package de.jodamob.kotlin.droidcon.d;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertTrue;

public class RadioState1Test {

    @Test
    public void should_calculate_strengths() {

        Map<RadioState.SignalTypes, Integer> signalStrength = new HashMap<>();
        signalStrength.put(RadioState.SignalTypes.EDGE, 90);
        signalStrength.put(RadioState.SignalTypes.WIFI, 0);

        assertTrue(RadioState.isSignalStrongEnough(signalStrength));
    }
}