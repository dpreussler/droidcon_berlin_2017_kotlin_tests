package de.jodamob.kotlin.droidcon.b;

import org.junit.Test;


public class ImportantClassCheckingSomethingTest {

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_if_empty() {
        ImportantClassCheckingSomething tested = new ImportantClassCheckingSomething();
        tested.dontletItHappen("");
    }
}