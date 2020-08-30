package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParamTests {

    @Test
    @Tag("withParams")
    void paramStringTests() {
        Configuration.headless = true;
        
        String s = System.getProperty("s", "This is string");

        assertEquals(s,"BlaBla");
    }
}
