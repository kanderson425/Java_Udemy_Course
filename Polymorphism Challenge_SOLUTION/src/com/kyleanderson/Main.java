package com.kyleanderson;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car => Start Engine!";
    }

    public String accelerate() {
        return "Car => Accelerate!";
    }

    public String brake() {
        return "Car => Brake!";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi => Start Engine!";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi => Accelerate!";
    }

    @Override
    public String brake() {
        return "Mitsubishi => Brake!";
    }
}

public class Main {

    public static void main(String[] args) {
	Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

    Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

    Ford ford = new Ford(8, "Explorer");
    System.out.println(ford.startEngine());
    System.out.println(ford.accelerate());
    System.out.println(ford.brake());
    }
}
