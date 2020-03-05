package com.kyleanderson;

import jdk.jshell.execution.Util;

import static org.junit.Assert.*;

public class UtilitiesTest {


    @org.junit.Test
    public void everyNthChar() throws Exception {
        Utilities util = new Utilities();
        char[] source = {'h','e','l','l','o'};
        char[] output = util.everyNthChar(new char[] {'h','e','l','l','o'}, 2);
        assertArrayEquals(output, util.everyNthChar(source, 2));

        char[] output2 = util.everyNthChar(new char[] {'h','e','l','l','o'}, 8);
        assertArrayEquals(new char[] {'h','e','l','l','o'},output2);

    }

    @org.junit.Test
    public void removePairs() throws Exception  {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned. Argument passed is null", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", "");

    }

    @org.junit.Test
    public void converter() throws Exception {
        Utilities util = new Utilities();
        assertEquals(300,util.converter(10, 5));

    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception {
        Utilities util = new Utilities();
        assertNotNull(util.nullIfOddLength("Test"));

        assertNull(util.nullIfOddLength("Testing"));
    }
}