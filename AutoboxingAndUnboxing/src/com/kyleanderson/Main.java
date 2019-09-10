package com.kyleanderson;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	String[] strArray = new String[10];
	int[] intArray = new  int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Kyle");

//        This will error out below:
//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<= 10; i++) {
            intArrayList.add(Integer.valueOf(i));

            }
        for(int i=0; i<= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // Integer myIntValue = Integer.valueOf(56); This is how the code below is compiled. The below code is a shortcut
        int myInt = myIntValue; //Java is essentially doing some background stuff... myIntValue.intValue();
        //This is the concept of autoboxing at work.




    }
}
