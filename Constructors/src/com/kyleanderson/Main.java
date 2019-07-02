package com.kyleanderson;

public class Main {

    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount(1234, 0.00, "Bob Brown", "myemail@bob.com", "238-283-9999");


        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());


        bobsAccount.withdrawFunds(100.0);

        bobsAccount.depositFunds(50);

        bobsAccount.depositFunds(51);
        bobsAccount.withdrawFunds(100);


        BankAccount kylesAccount = new BankAccount("Kyle", "kyle@email.com", "1234");
        System.out.println(kylesAccount.getAccountNumber() + " name " + kylesAccount.getCustomerName());




    }
}
