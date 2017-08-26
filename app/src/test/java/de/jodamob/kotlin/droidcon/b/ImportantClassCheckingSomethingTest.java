package de.jodamob.kotlin.droidcon.b;

import org.junit.Test;
import de.jodamob.kotlin.droidcon.a.ImportantClassDoingSomething;


public class ImportantClassCheckingSomethingTest {

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_if_empy() {
        ImportantClassCheckingSomething tested = new ImportantClassCheckingSomething();
        tested.dontletItHappen("");
    }
}