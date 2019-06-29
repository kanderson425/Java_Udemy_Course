package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
//	    Car porsche = new Car();
//	    Car holden = new Car();
//	    porsche.setModel("Carrera");
//
//		System.out.println("Model is " + porsche.getModel());

		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("add = " + calculator.getAdditionResult());
		System.out.println("subtract = " + calculator.getSubtractionResult());
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		System.out.println("multiply = "+ calculator.getMultiplicationResult());
		System.out.println("divide = " + calculator.getDivisionResult());
    }
}
