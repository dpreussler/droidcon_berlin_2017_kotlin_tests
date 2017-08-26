package de.jodamob.kotlin.droidcon.a;

import org.junit.Test;

public class ImportantClassDoingSomethingTest {

    ImportantClassDoingSomething tested = new ImportantClassDoingSomething();

    @Test
    public void testHandlesNullArguments() {
        tested.makeItHappen(null);
    }

}