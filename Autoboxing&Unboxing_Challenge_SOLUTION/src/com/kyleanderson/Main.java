package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
	Bank bank = new Bank("Wells Fargo Bank");

	bank.addBranch("Austin");

	bank.addCustomer("Austin", "Kyle", 50.05);
	bank.addCustomer("Austin", "Sarah", 100.25);
	bank.addCustomer("Austin", "Curtis", 200.35);

	bank.addBranch("Houston");

	bank.addCustomer("Houston", "Cheryl", 100.10);

	bank.addCustomerTransaction("Austin", "Kyle", 44.22);
	bank.addCustomerTransaction("Austin","Kyle", 50.98);
	bank.addCustomerTransaction("Houston", "Cheryl", 25.89);

	bank.listCustomers("Austin", true);

    }
}
