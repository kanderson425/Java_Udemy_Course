package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
		SomeClass one = new SomeClass("one");
		SomeClass two = new SomeClass("two");
		SomeClass three = new SomeClass("three");

		System.out.println(one.getInstanceNumber());
		System.out.println(two.getInstanceNumber());
		System.out.println(three.getInstanceNumber());

//		one.instanceNumber = 4;
		// The reason that the above does not work is b/c the instanceNumber variable is a final variable, meaning
		// that this variable is getting treated as a constant and cannot be modified directy/after the variable has been set.

		System.out.println(Math.PI);
		Math m = new Math();
    }
}
