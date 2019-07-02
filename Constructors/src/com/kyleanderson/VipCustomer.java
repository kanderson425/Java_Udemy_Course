package com.kyleanderson;

public class VipCustomer {

    //fields
    private String name;
    private double creditLimit;
    private String emailAddress;


    //methods

    public VipCustomer() {
        this("kyle", 1000.00, "kyle@email.com");
        System.out.println("Empty constructor called");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {

        System.out.println("Account constructor with parameters called");

        this.creditLimit = creditLimit;
        this. emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }



}
