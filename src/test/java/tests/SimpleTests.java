package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTests {

    @Test
    void PositiveTest() {
        assertEquals(4,4);
    }

    @Test
    void NegativeTest() {
        assertEquals(7, 33);
    }
}
