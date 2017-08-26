package de.jodamob.kotlin.droidcon.a;

import org.junit.Test;

import de.jodamob.kotlin.droidcon.ImportantClassDoingSomething;

public class ImportantClassDoingSomethingTest {

    ImportantClassDoingSomething tested = new ImportantClassDoingSomething();

    @Test
    public void testHandlesNullArguments() {
        tested.makeItHappen(null);
    }

}