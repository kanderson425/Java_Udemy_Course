package com.kyleanderson;

import java.util.ArrayList;

public class Customer {
    public String customerName;
    ArrayList<Double> transactionsArrayList = new ArrayList<Double>();

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactionsArrayList() {
        return transactionsArrayList;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setTransactionsArrayList(ArrayList<Double> transactionsArrayList) {
        this.transactionsArrayList = transactionsArrayList;
    }
}
