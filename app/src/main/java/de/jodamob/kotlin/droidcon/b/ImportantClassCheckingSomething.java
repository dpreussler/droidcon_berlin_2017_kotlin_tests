package de.jodamob.kotlin.droidcon.b;

public class ImportantClassCheckingSomething {

    public void dontletItHappen(String argument) throws IllegalArgumentException {
        if (argument.isEmpty()) {
            throw new IllegalArgumentException("was empty");
        }
    }
}
