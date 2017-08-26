package de.jodamob.kotlin.droidcon;

import com.google.gson.Gson;

import java.util.Map;

public class AwesomeParser {

    private final Gson gson = new Gson();

    public static class Channels{
        Map<String, Integer> channels;
    }

    public Map<String, Integer> parse(final String jsonText) {
        return gson.fromJson(jsonText, Channels.class).channels;
    }
}
