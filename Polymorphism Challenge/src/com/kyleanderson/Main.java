package com.kyleanderson;

public class Main {

    class Car {
        private String name;
        private boolean engine;
        private int cylinders;
        private int wheels;

        public Car(String name, int cylinders) {
            this.name = name;
            this.engine = true;
            this.cylinders = cylinders;
            this.wheels = 4;
        }

        public String getName() {
            return name;
        }

        public boolean isEngine() {
            return engine;
        }

        public int getCylinders() {
            return cylinders;
        }

        public int getWheels() {
            return wheels;
        }

        public void startEngine() {
            System.out.println("The car engine is starting");
        }

        public void accelerate() {
            System.out.println("The car is now accelerating");

        }

        public void brake() {
            System.out.println("The car is now braking");

        }

    }

    public static void main(String[] args) {
	// write your code here
    }
}
