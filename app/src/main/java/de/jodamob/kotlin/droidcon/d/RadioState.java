package de.jodamob.kotlin.droidcon.d;

import java.util.Map;
public class RadioState {

    public enum SignalTypes {
        WIFI, GPRS, EDGE;
    }
    private boolean flightMode;
    private boolean wifiConnected;

    public static RadioState ALL_OFF = new RadioState(true, false);
    public static RadioState ALL_ON = new RadioState(false, true);

    public RadioState(final boolean flightMode, final boolean wifiConnected) {
        this.flightMode = flightMode;
        this.wifiConnected = wifiConnected;
    }

    public boolean isCellularNetworkConnected() {
        return !flightMode;
    }

    public boolean isWifiNetworkConnected() {
        return wifiConnected;
    }


    public static boolean isSignalStrongEnough(Map<SignalTypes, Integer> signalstrenght) {
        // TODO add very complicated algorithm
        return !signalstrenght.isEmpty();
    }
}
