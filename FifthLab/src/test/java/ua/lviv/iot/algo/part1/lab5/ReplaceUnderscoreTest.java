package ua.lviv.iot.algo.part1.lab5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ReplaceUnderscoreTest {
    int length;
    ReplaceUnderscore formatter;

    @Before
    public void setUp() {
        length = 50;
        formatter = new ReplaceUnderscore();
    }

    @Test
    public void testReplaceDashesWithNull() {
        assertNull(formatter.replaceDashes(null, 0));
    }

    @Test
    public void testReplaceDashes() {
        String actual = String.valueOf(formatter.replaceDashes("The quick-brown fox jumps over the lazy-dog.",
                "The quick-brown fox jumps over the lazy-dog.".length()));
        assertEquals("The quick_brown fox jumps over the lazy_dog.", actual);
    }

    @Test
    public void testReplaceDashesWithNoDashes(){
        String actual = String.valueOf(formatter.replaceDashes("This is sparta","This is sparta".length()));
        assertEquals("This is sparta",actual);
    }

    @Test
    public void testReplaceDashesWithTwoNumber(){
        String actual = String.valueOf(formatter.replaceDashes("067-211","067-211".length()));
        assertEquals("067_211",actual);
    }

    @Test
    public void testReplaceDashesWithManyNumber(){
        String actual = String.valueOf(formatter.replaceDashes("067-211-11-11","067-211-11-11".length()));
        assertEquals("067_211-11_11",actual);
    }

    @Test
    public void testReplaceDashesWithOnlyDashesText(){
        String actual = String.valueOf(formatter.replaceDashes("-","-".length()));
        assertEquals("-",actual);
    }
}

