package com.kyleanderson;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void breathe();
}
