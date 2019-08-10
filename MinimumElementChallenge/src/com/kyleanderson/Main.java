package com.kyleanderson;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	int[] myIntegers = readIntegers(5);
     ystem.out.println("myIntegers = " + Arrays.toString(myIntegers));
    findMin(myIntegers);
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter " + count + " integer values:\r");
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] myIntegers) {
        int min;
        int temp;
        for (int i = 0; i < myIntegers.length - 1; i++) {
            for (int j = i + 1; j < myIntegers.length - 1; i++) {
                if (myIntegers[i] > myIntegers[j]) {
                    temp = myIntegers[i];
                    myIntegers[i] = myIntegers[j];
                    myIntegers[j] = temp;
                }
            }
        }
        min = myIntegers[0];
        return min;
    }
}
