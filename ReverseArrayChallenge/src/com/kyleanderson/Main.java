package com.kyleanderson;

import java.util.Arrays;
import java.util.Collections;

public class Main {

//    //My Attempt
//    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5};
//        System.out.println("array = " + Arrays.toString(array));
//        reverse(array);
//    }
//    public static void reverse(int[] array) {
//        int i, k, t;
//        for (i = 0; i < array.length / 2; i++) {
//            t = array[i];
//            array[i] = array[array.length - i - 1];
//            array[array.length - i - 1] = t;
//        }
//        System.out.println("Reversed Array is: " + Arrays.toString(array));
//    }


    //Solution
    public static void main(String[] args) {
        int[] array = {1,5,3,7,11,9,15};
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));

    }
    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for(int i=0; i<halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex-i] = temp;
        }
    }

}
