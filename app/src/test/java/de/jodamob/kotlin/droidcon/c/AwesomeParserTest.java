package de.jodamob.kotlin.droidcon.c;


import org.junit.Test;

import java.util.Map;

import static junit.framework.Assert.assertEquals;

public class AwesomeParserTest {

    AwesomeParser tested = new AwesomeParser();
    String jsonText = "{\"channels\":{\"BOOKING\":1443439538,\"GTG\":1443439537}}";

    @Test
    public void should_parse() {
        Map<String, Integer> parsed = tested.parse(jsonText);
        assertEquals(1443439538, parsed.get("BOOKING").intValue());
    }
}
