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
//        ArrayList<int> intArrayList = new ArraList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));


    }
}
