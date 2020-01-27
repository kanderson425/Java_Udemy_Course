package com.kyleanderson;

public class Main {

    public static void main(String[] args) {
	final BankAccount account = new BankAccount(1000.00, "12345-678");

	// My Solution
//    new Thread(new Runnable() {
//        @Override
//        public void run() {
//            account.deposit(300.00);
//            account.withdraw(50.00);
//
//        }
//    }).start();
//
//    new Thread(new Runnable() {
//        @Override
//        public void run() {
//            account.deposit(203.75);
//            account.withdraw(100.00);
//        }
//    }).start();

        // Tim's Solution
        Thread trThread1 = new Thread() {
            public void run() {
                account.deposit(300.00);
                account.withdraw(50.00);

            }
        };

        Thread trThread2 = new Thread() {
            public void run() {
                account.deposit(203.75);
                account.withdraw(10.00);
            }
        };

        trThread1.start();
        trThread2.start();

    }
}
