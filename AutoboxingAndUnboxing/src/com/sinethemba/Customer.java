package com.sinethemba;

import java.util.ArrayList;

public class Customer {

    private  String name;
    private ArrayList<Double> transtation;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transtation = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount){
        this.transtation.add(amount);
        System.out.println("You have transacted R" + amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTranstation() {
        return transtation;
    }
}


