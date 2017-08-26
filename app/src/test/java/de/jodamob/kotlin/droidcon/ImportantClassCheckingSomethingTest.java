package de.jodamob.kotlin.droidcon;

import org.junit.Test;
public class ImportantClassCheckingSomethingTest {

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_if_empy() {
        ImportantClassDoingSomething tested = new ImportantClassDoingSomething();
        tested.makeItHappen("");
    }
}