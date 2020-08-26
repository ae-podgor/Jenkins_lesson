package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTests {

    @Test
    @Tag("Simple")
    void PositiveTest() {
        assertEquals(4,4);
    }

    @Test
    @Tag("Bad")
    void NegativeTest() {
        assertEquals(7, 33);
    }
}
