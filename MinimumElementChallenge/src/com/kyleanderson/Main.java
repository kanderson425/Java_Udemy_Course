package com.kyleanderson;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	int[] myIntegers = readIntegers(5);
     System.out.println("myIntegers = " + Arrays.toString(myIntegers));
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
        boolean flag = true;
        while(flag) {
            flag = false;
            for(int i=0; i<myIntegers.length-1; i++) {
                if(myIntegers[i] > myIntegers[i+1]) {
                    temp = myIntegers[i];
                    myIntegers[i] = myIntegers[i + 1];
                    myIntegers[i+1] = temp;
                    flag = true;

                }
            }
        }
        min = myIntegers[0];
        System.out.println("The min value is " + min);
        return min;
    }
}
