package com.kyleanderson;

import java.util.Scanner;
public class Main {
    //Adds the scanner functionality
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i +", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

//    //This is how you can initialize an array with all of the array elements
//	int[] myIntArray = new int[25];
////	myIntArray[0] = 45;
////	myIntArray[5] = 50;
//        for(int i=0; i<myIntArray.length; i++) {
//            myIntArray[i] = i*10;
//        }
//        printArray(myIntArray);
//    }
//
//    public static void printArray(int[] array) {
//        for(int i=0; i<array.length; i++) {
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
    }
    //Adds the scanner functionality
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}
