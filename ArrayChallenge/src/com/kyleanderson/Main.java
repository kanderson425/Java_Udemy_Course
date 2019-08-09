package com.kyleanderson;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] myIntegers) {
        System.out.println("Print the array:");
        for(int i=0; i<myIntegers.length-1; i++) {
            System.out.print(myIntegers[i] + ",");
        }
        System.out.print(myIntegers[myIntegers.length - 1]);
    }

    public static void sortIntegers(int[] myIntegers) {
        System.out.print("Ascending order:");
        int temp;
        for(int i = 0; i <myIntegers.length; i++) {
            for(int j =0; j<myIntegers.length; j++) {
                if(myIntegers[i] > myIntegers[j]) {
                    temp = myIntegers[i];
                    myIntegers[i] = myIntegers[j];
                    myIntegers[j] = temp;
                }
            }
        }
        for(int i = 0; i<myIntegers.length - 1; i++) {
            System.out.print(myIntegers[i] + ",");
        }
        System.out.print(myIntegers[myIntegers.length -1]);
    }

}
