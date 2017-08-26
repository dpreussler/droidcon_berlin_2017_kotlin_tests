package de.jodamob.kotlin.droidcon;

import org.junit.Test;

public class ImportantClassDoingSomethingTest {

    ImportantClassDoingSomething tested = new ImportantClassDoingSomething();

    @Test
    public void testHandlesNullArguments() {
        tested.makeItHappen(null);
    }

}