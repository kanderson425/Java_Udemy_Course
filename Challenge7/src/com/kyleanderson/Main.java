package com.kyleanderson;

public class Main {
    public static void main(String[] args){
        BankAccount account1=new BankAccount("12345-678",500.00);
        BankAccount account2=new BankAccount("98765-432",1000.00);

        new Thread(new Transfer(account1,account2,10.00),"Transfer1").start();
        new Thread(new Transfer(account2,account1,55.88),"Transfer2").start();

    }

}






