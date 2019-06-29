package com.kyleanderson;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public double setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
        return  firstNumber;
    }

    public double setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
        return secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;

    }


    public double getSubtractionResult() {
        return firstNumber - secondNumber;

    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if(secondNumber == 0) {
            return 0;
        } else {
         return firstNumber / secondNumber;
        }

    }
}
