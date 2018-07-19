package com.sinethemba;

public class Main {

    public static void main(String[] args) {

        Account sinethembaAccount = new Account("Sinethemba");
        sinethembaAccount.deposit(5000);
        sinethembaAccount.withdraw(500);
        sinethembaAccount.withdraw(-100);
        sinethembaAccount.deposit(-100);
        sinethembaAccount.calculateBalance();

        System.out.println("The balance on " + sinethembaAccount.getName() + "'s account is R" + sinethembaAccount.getBalance());
    }
}
