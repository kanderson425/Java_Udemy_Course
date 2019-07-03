package com.kyleanderson;

public class Main {

    public static void main(String[] args) {

        //BankAccount Exercise
//        BankAccount bobsAccount = new BankAccount(1234, 0.00, "Bob Brown", "myemail@bob.com", "238-283-9999");
//
//
//        System.out.println(bobsAccount.getAccountNumber());
//        System.out.println(bobsAccount.getBalance());
//
//
//        bobsAccount.withdrawFunds(100.0);
//
//        bobsAccount.depositFunds(50);
//
//        bobsAccount.depositFunds(51);
//        bobsAccount.withdrawFunds(100);
//
//
//        BankAccount kylesAccount = new BankAccount("Kyle", "kyle@email.com", "1234");
//        System.out.println(kylesAccount.getAccountNumber() + " name " + kylesAccount.getCustomerName());


        //VIPCustomer Exercise
//        VipCustomer person1 = new VipCustomer();
//        System.out.println(person1.getName());
//
//        VipCustomer person2 = new VipCustomer("Logan", 20000.00);
//        System.out.println(person2.getName());
//
//        VipCustomer person3 = new VipCustomer("Tim", 1000.00, "tim@email.com");
//        System.out.println(person3.getName());
//        System.out.println(person3.getEmailAddress());

        //Wall
//        Wall wall = new Wall(5,4);
//        System.out.println("area= " + wall.getArea());
//
//        wall.setHeight(-1.5);
//        System.out.println("width= " + wall.getWidth());
//        System.out.println("heigt= " + wall.getHeight());
//        System.out.println("area= " + wall.getArea());

        //Point
//        Point first = new Point(6,5);
//        Point second = new Point(3,1);
//        System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2,2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());

        //CarpetCostCalculator
//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4,4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());

        //ComplexNumber
        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
