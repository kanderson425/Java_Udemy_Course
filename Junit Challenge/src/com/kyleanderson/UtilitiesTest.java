package com.kyleanderson;

import jdk.jshell.execution.Util;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities util;

    @org.junit.Before
    public void setup() {
        util = new Utilities();
        System.out.println("Running some tests...");
    }


    @org.junit.Test
    public void everyNthChar() throws Exception {
        char[] source = {'h','e','l','l','o'};
        char[] output = util.everyNthChar(new char[] {'h','e','l','l','o'}, 2);
        assertArrayEquals(output, util.everyNthChar(source, 2));

        char[] output2 = util.everyNthChar(new char[] {'h','e','l','l','o'}, 8);
        assertArrayEquals(new char[] {'h','e','l','l','o'},output2);

    }

    @org.junit.Test
    public void removePairs() throws Exception  {
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertEquals("A", util.removePairs("A"));
    }

    @org.junit.Test
    public void removePairs_emptyString() throws Exception {
        assertEquals("", "");
    }

    @org.junit.Test
    public void removePairs_null() throws Exception {
        assertNull("Did not get null returned. Argument passed is null", util.removePairs(null));

    }

    @org.junit.Test
    public void converter() throws Exception {
        assertEquals(300,util.converter(10, 5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() throws Exception {
        util.converter(10, 0);
    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception {
        assertNull(util.nullIfOddLength("Testing"));
    }

    @org.junit.Test
    public void nullIfOddLength_notNull() throws Exception {
        assertNotNull(util.nullIfOddLength("Test"));
    }
}