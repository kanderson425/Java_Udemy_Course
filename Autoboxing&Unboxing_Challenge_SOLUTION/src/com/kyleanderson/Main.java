package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
	Bank bank = new Bank("Wells Fargo Bank");

	if(bank.addBranch("Austin")) {
		System.out.println("Austin branch created");
	}

	bank.addCustomer("Austin", "Kyle", 50.05);
	bank.addCustomer("Austin", "Sarah", 100.25);
	bank.addCustomer("Austin", "Curtis", 200.35);

	bank.addBranch("Houston");

	bank.addCustomer("Houston", "Cheryl", 100.10);

	bank.addCustomerTransaction("Austin", "Kyle", 44.22);
	bank.addCustomerTransaction("Austin","Kyle", 50.98);
	bank.addCustomerTransaction("Houston", "Cheryl", 25.89);

	bank.listCustomers("Austin", true);
	bank.listCustomers("Houston",true);

	//Testing the .addBranch method
	bank.addBranch("Dallas");
	if(!bank.addCustomer("Dallas", "Brian", 5.32)) {
		System.out.println("Error Dallas Branch does not exist");
		}

		if (!bank.addBranch("Austin")) {

			System.out.println("Austin branch already exists");
		}

		if(!bank.addCustomerTransaction("Austin","Fergus", 52.33)) {
			System.out.println("Customer does not exist");
		}

		if(!bank.addCustomer("Austin","Kyle",12.21)) {
			System.out.println("Customer Kyle already exists");
		}


    }


}


