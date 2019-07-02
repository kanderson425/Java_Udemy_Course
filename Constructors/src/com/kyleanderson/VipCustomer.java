package com.kyleanderson;

public class VipCustomer {

    //fields
    private String name;
    private double creditLimit;
    private String emailAddress;


    //constructors
    public VipCustomer() {
        this("Kyle", 1000.00, "kyle@email.com");

    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknownEmail.com");
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
