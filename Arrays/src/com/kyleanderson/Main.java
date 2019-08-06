package com.kyleanderson;

public class Main {

    public static void main(String[] args) {

    //This is how you can initialize an array with all of the array elements
	int[] myIntArray = new int[10];
//	myIntArray[0] = 45;
//	myIntArray[5] = 50;
        for(int i=0; i<10; i++) {
            myIntArray[i] = i*10;
        }
        for(int i=0; i<10; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }


    }
}
