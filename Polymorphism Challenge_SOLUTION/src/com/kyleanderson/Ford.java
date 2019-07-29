package com.kyleanderson;

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford => Start Engine!";
    }

    @Override
    public String accelerate() {
        return "Ford => Accelerate!";
    }

    @Override
    public String brake() {
        return "Ford => Brake!";
    }
}

