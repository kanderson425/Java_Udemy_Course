package com.kyleanderson;

public class Gearbox {
    private boolean clutchIsIn;

    public void operateCluth(String inOrOut) {
        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
    }


}
