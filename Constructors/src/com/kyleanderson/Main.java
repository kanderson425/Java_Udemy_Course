package com.kyleanderson;

import java.awt.image.VolatileImage;

public class Main {

    public static void main(String[] args) {

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


        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Logan", 20000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 1000.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());


    }
}
