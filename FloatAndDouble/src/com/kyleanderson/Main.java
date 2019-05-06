package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
	int myIntValue = 5 / 3;
	//width of int = 32 (4 bytes)

	float myFloatValue = 5f / 3f;
	// width of float = 32 (4 bytes)

	double myDoubleValue = 5d / 3d;
	// width of a double = 64 (8 bytes)


        System.out.println(("myIntValue = " + myIntValue));
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

    double conversionFactor = 0.45359237;
    double numPounds = 200d;
    double kilograms = numPounds * conversionFactor;

        System.out.printf("kilograms = " + kilograms);
        // 90.718474

    double pi = 3.1415927d;

    }
}
