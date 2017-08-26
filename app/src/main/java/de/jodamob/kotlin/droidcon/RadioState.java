package de.jodamob.kotlin.droidcon;

public class RadioState {

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
}
