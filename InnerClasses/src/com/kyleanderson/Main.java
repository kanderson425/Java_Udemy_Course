package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
	//4 Types of inner classes: static nested, non-static class (inner class), inner class, anonymous class
        Gearbox mcLaren = new Gearbox(6);
        mcLaren.addGear(1,5.3);
        mcLaren.addGear(2, 10.6);
        mcLaren.addGear(3,15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));






    }
}
