package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParamTests {

    @Test
    void paramStringTests() {
        String s = System.getProperty("s", "This is string");

        assertEquals(s,"BlaBla");
    }
}
