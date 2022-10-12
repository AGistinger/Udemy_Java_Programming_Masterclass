package com.junit_challenge;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.testng.Assert.*;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class UtilitiesTest {
    public static Utilities util;

    @Before
    public void setup() {
        util = new Utilities();
    }

    @Test
    public void everyNthChar_A() {
        char[] output = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] {'e', 'l'}, output);
    }

    @Test
    public void everyNthChar_B() {
        char[] output = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[] {'h','e', 'l', 'l', 'o'}, output);
    }

    @Test
    public void removePairs_A() {
        assertEquals( "ABCDEF", util.removePairs("AABCDDEFF"));
    }

    @Test
    public void removePairs_B() {
        assertEquals( "ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @Test
    public void removePairs_C() {
        assertNull(null, util.removePairs(null));
    }

    @Test
    public void removePairs_D() {
        assertEquals( "A", util.removePairs("A"));
    }
    @Test
    public void removePairs_E() {
        assertEquals( "", util.removePairs(""));
    }

    @Test
    public void converter() {
        assertEquals(300, util.converter(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void converter_invalid() {
        util.converter(10, 0);
        fail("Should have thrown ArithmeticException");
    }

    @Test
    public void nullIfOddLength() {
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}