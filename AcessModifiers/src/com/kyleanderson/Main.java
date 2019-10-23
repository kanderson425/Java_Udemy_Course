package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
	    Account kylesAccount = new Account("Kyle");
	    kylesAccount.deposit(1000);
	    kylesAccount.withdraw(500);
	    kylesAccount.withdraw(-200);
	    kylesAccount.deposit(-20);
	    kylesAccount.calculateBalance();

        System.out.println("Balance on account is " + kylesAccount.getBalance());
    }
}
