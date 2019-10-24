package com.kyleanderson;

public class StaticTest {
    private int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances ++;
    }

    public int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
