package com.kyleanderson;

import java.util.Arrays;
import java.util.Collections;

public class Main {


    //My Attempt

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        System.out.println("array = " + Arrays.toString(array));

        reverse(array);

    }


    public static void reverse(int[] array) {
        int i, k, t;
        for (i = 0; i < array.length / 2; i++) {
            t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }
        System.out.println("Reversed Array is: " + Arrays.toString(array));
    }

}
