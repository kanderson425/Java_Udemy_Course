package com.kyleanderson;

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

class BMW extends Car {
    public BMW() {
        super("BMW", 6);
    }

    @Override
    public String getName() {
        return "This here car is a BEEEEMER";
    }
}

class Subaru extends Car {
    public Subaru() {
        super("Subaru", 4);
    }

    @Override
    public String getName() {
        return "This Car is a Subaru - very nice!";
    }
}

class Jeep extends Car {
    public Jeep() {
        super("Jeep", 6);
    }

    @Override
    public String getName() {
        return "This tool of warfare defeated the damn Nazis!";
    }
}

public class Main {

    public static void main(String[] args) {
	    for(int i = 1; i < 11; i++) {
	        Car car = randomCar();
            System.out.println("Car #" + i +
                    " : " + car.getName() + "\n" +
                    "Cylinders: " + car.getCylinders() + "\n");
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new BMW();
            case 2:
                return new Subaru();
            case 3:
                return new Jeep();
        }
        return null;
    }
}
