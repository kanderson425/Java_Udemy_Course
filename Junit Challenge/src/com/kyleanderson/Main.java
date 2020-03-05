package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
    Utilities util = new Utilities();

        System.out.println("Input is: ABCDDEFF");
        util.removePairs("ABCDEDEFF");

        char[] source = {'h','e','l','l','o'};
        util.everyNthChar(source, 2);
    }
}
