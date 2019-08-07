package com.kyleanderson;

public class Main {

    public static void main(String[] args) {

    //This is how you can initialize an array with all of the array elements
	int[] myIntArray = new int[25];
//	myIntArray[0] = 45;
//	myIntArray[5] = 50;
        for(int i=0; i<myIntArray.length; i++) {
            myIntArray[i] = i*10;
        }
        printArray(myIntArray);
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
