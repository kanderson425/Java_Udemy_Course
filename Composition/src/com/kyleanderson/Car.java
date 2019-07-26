package com.kyleanderson;

public class Car extends Vehicle {

    private int doors;
    private int engingeCapacity;

    public Car(String name, int doors, int engingeCapacity) {
        super(name);
        this.doors = doors;
        this.engingeCapacity = engingeCapacity;
    }
}
