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

//        String newString2 = util.removePairs("ABCCABDEEF");
//        assertEquals("ABCABDEF", newString2);

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