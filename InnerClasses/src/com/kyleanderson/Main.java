package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
	//4 Types of inner classes: static nested, non-static class (inner class), inner class, anonymous class

        Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(1,12.3);
//        Gearbox.Gear second = new Gearbox.Gear(2,15.4); //you can't do this
//        Gearbox.Gear third = new mcLaren.Gear(3,17.0); // you cannot do this either b/c you need to create a new instance of gear on the mclaren object
        System.out.println(first.driveSpeed(1000));

    }
}
