package de.jodamob.kotlin.droidcon.c;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AwesomeParserTest {

    AwesomeParser tested = new AwesomeParser();
    String jsonText = "{\"channels\":{\"BOOKING\":1443439538,\"GTG\":1443439537}}";

    @Test
    public void should_parse() {
        assertEquals(1443439538, tested.parse(jsonText).get("BOOKING").intValue());
    }
}
