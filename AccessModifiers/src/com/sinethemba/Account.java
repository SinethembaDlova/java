package com.sinethemba;

import java.util.ArrayList;

public class Account {

    private String name;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String name) {
        this.name = name;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void deposit(int amount){
        if (amount > 0){
            transactions.add(amount);
            this.balance += amount;
            System.out.println("R" + amount + " is deposited. The balance is now R" + this.balance);
        }
        else {
            System.out.println("Cannot deposit negative amount. Please put in some money,");
        }
    }

    public void withdraw(int amount){
        int withdrawalAmount = -amount;
        if (withdrawalAmount < 0){
            this.transactions.add(withdrawalAmount);
            this.balance += withdrawalAmount;
            System.out.println("R" + amount + " withdrawn. Balance is now R" + this.balance);
        }
        else {
            System.out.println("Cannot withdraw amount.");
        }
    }

    public void calculateBalance(){
       this.balance = 0;
       for (int i: this.transactions){
           this.balance += i;
       }
        System.out.println("Calculated balance is R" + this.balance);
    }

}
