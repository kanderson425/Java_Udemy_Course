package com.kyleanderson;

public class DogMain {
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));

//        This highlights the fact that you need to be cognizant of how you treat comparisons between
//        a class and its subclasses. A way to get around this is to mark your equals and HashCode methods
//        as final
    }
}
