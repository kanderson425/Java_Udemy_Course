package com.kyleanderson;

public class ComplexNumber {

    //fields
    private double real;
    private double imaginary;


    //constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //methods

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public double add(ComplexNumber complexNumber) {

    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;

    }

    public double subtract(ComplexNumber complexNumber) {

    }
}
