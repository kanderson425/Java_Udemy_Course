package com.kyleanderson;
import java.util.Scanner;


public class Main {
    //My Attempt
//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int[] myIntegers = getIntegers(5);
//        printArray(myIntegers);
//        sortIntegers(myIntegers);
//
//    }
//
//    public static int[] getIntegers(int number) {
//        System.out.println("Enter " + number + " integer values.\r");
//        int[] values = new int[number];
//        for(int i=0; i<values.length; i++) {
//            values[i] = scanner.nextInt();
//        }
//        return values;
//    }
//
//    public static void printArray(int[] myIntegers) {
//        System.out.println("Print the array:");
//        for(int i=0; i<myIntegers.length-1; i++) {
//            System.out.print(myIntegers[i] + ",");
//        }
//        System.out.println(myIntegers[myIntegers.length - 1]);
//    }
//
//    public static void sortIntegers(int[] myIntegers) {
//        System.out.println("Ascending order:");
//        int temp;
//        for(int i = 0; i <myIntegers.length; i++) {
//            for(int j =0; j<myIntegers.length; j++) {
//                if(myIntegers[i] < myIntegers[j]) {
//                    temp = myIntegers[i];
//                    myIntegers[i] = myIntegers[j];
//                    myIntegers[j] = temp;
//                }
//            }
//        }
//        for(int i = 0; i<myIntegers.length - 1; i++) {
//            System.out.print(myIntegers[i] + ",");
//        }
//        System.out.print(myIntegers[myIntegers.length -1]);
//    }


    //Solution
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i =0; i<array.length; i++) {
            System.out.println("ELement " + i + " contents " + array[i]);
        }
    }

}
