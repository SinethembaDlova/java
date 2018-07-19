package com.sinethemba;

public class Main {

    public static void main(String[] args) {

        BankAccount Sinethemba = new BankAccount();

        Sinethemba.setBalance(0);
        Sinethemba.getBalance();

        Sinethemba.setDeposit(100);
        Sinethemba.getBalance();

        Sinethemba.setWithdrawal(10);
        Sinethemba.setWithdrawal(100);

        Sinethemba.getBalance();

        System.out.println("");


        BankAccount AneleAccount = new BankAccount(1011, 0.0, "Anele Mamputa", "anele@gmail.com", "081 325 1120");

        System.out.println("");

        VipCustomer Zara = new VipCustomer();
        VipCustomer Andile = new VipCustomer("Andile Dongwe", "andile@gmail.com");
        VipCustomer Sammy = new VipCustomer("Samantha Lucy", 10000, "sammy@gmail.com");
    }
}
