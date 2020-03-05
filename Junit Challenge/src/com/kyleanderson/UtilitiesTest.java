package com.kyleanderson;

import jdk.jshell.execution.Util;

import static org.junit.Assert.*;

public class UtilitiesTest {


    @org.junit.Test
    public void everyNthChar() throws Exception {
        fail("This test has not been implemented");
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
        fail("This test has not been implemented");
    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception {
        fail("This test has not been implemented");
    }
}