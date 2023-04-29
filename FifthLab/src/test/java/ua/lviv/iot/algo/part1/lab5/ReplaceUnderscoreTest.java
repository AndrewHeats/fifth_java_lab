package ua.lviv.iot.algo.part1.lab5;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ReplaceUnderscoreTest {
    String EXPECTED = "The quick_brown fox jumps over the lazy_dog.";
    String text;
    int length;
    ReplaceUnderscore formatter;
    @Before
    public void setUp(){
        text = "The quick-brown fox jumps over the lazy-dog.";
        length = 50;
        formatter = new ReplaceUnderscore();
    }
    @Test
    public void testReplaceDashesWithNullText(){
        assertNull(formatter.replaceDashes(null,0));
    }

    @Test
    public void testReplaceDashes() {
        String actual = formatter.replaceDashes(text,length);
        assertEquals(EXPECTED, actual);
    }

}

