package de.jodamob.kotlin.droidcon.e;

import java.util.Arrays;
import java.util.List;
public class Greeter {

    public String greet(String who) {
        return "Hello " + who;
    }

    public List<String> getSomeGreetings() {
        return Arrays.asList("Hello", "Hallo", "Hola");
    }
}
