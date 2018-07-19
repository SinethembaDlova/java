package com.sinethemba;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class BankAccount {

    private  int account_number;
    private double balance;
    private String customer_name;
    private String email;
    private String phone_number;

    public BankAccount(){
        this(12345, 0.0, "default name", "defaul email", "000 000 0000");
        System.out.println("You have called an empty constructor");
    }

    public BankAccount(String customer_name, String email, String phone_number) {
        this(1000, 0.0, customer_name, email, phone_number);
    }

    public BankAccount(int account_number, double balance, String customer_name, String email, String phone_number){
        this.account_number = account_number;
        this.balance = balance;
        this.customer_name = customer_name;
        this.email = email;
        this.phone_number = phone_number;

        System.out.println(customer_name + " (account number: " + account_number + ") has created an a new account.");
        System.out.println("Your balance is R" + balance);
        System.out.println("Your email adress is " + email);
        System.out.println("Your phone number is " + phone_number);
    }
    //setter and getter for account number
    public void setAccount_number(int account_number){
        this.account_number = account_number;
    }

    public int getAccount_number(){
        System.out.println("Your account numnber is " + account_number);
        return account_number;
    }

    //setters and getters for balance
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        System.out.println("Your current balance is R" + balance);
        return balance;
    }

    //setters and getters for customer namme
    public void setCustomer_name(String customer_name){
        this.customer_name = customer_name;
    }

    public String getCustomer_name(){
        System.out.println("This is an account of " + customer_name);
        return  customer_name;
    }

    //setters and getter for email
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        System.out.println("Your email address is: " + email);
        return email;
    }

    //setters and getter for phone number
    public void setPhone_number(String phone_number){
        this.phone_number = phone_number;
    }

    public String getPhone_number(){
        System.out.println("Your phone number is: " + phone_number);
        return phone_number;
    }

    //create a deposit method
    public void setDeposit(double amount){
        this.balance += amount;
        System.out.println("Your have deposited R" + 100);
    }


    //creating a withdrawing method
    public void setWithdrawal(double amount){
        double currentBalance = this.balance;

        if (amount <= currentBalance){
            this.balance = currentBalance - amount;
            System.out.println("You have withdrawn R" + amount + ". Your new balance is R" + this.balance);
        }
        else{
            System.out.println("Insufficient funds.");
        }

    }


}
