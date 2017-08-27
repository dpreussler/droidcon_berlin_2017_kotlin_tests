package de.jodamob.kotlin.droidcon.e;

import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class GreeterTest {

    Greeter tested = new Greeter();

    @Test
    public void should_greet() {
        assertEquals("Hello Droidcon", tested.greet("Droidcon"));
    }

    @Test
    public void should_be_interntional() {
        List<String> greetings = tested.getSomeGreetings();
        assertTrue(greetings.contains("Hallo"));
    }
}