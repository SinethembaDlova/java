package com.sinethemba;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("First National Bank");

        if (bank.addBranch("Gugulethu")){
            System.out.println("Gugulethu branch created.");
        }
        bank.addCustomer("Gugulethu", "Sinethemba", 150);
        bank.addCustomer("Gugulethu", "Andile", 200);
        bank.addCustomer("Gugulethu", "Live", 100);

        bank.addBranch("Athlone");
        bank.addCustomer("Athlone", "Anele", 50);

        bank.addCustomerTransaction("Gugulethu", "Sinethemba", 250);
        bank.addCustomerTransaction("Gugulethu", "Sinethemba", 550);
        bank.addCustomerTransaction("Gugulethu", "Sinethemba", 150);

        bank.listCustomers("Gugulethu", true);
        bank.listCustomers("Athlone", true);

        bank.addBranch("Waterfront");

        if (!bank.addCustomer("Waterfront", "Brian", 50)){
            System.out.println("The bank does not exist.");
        }

        if (!bank.addBranch("Gugulethu")){
            System.out.println("Gugulethu branch already exist.");
        }

        if (!bank.addCustomerTransaction("Gugulethu", "Fezile", 10)){
            System.out.println("Customer does not exist at the branch");
        }

        if (!bank.addCustomer("Gugulethu", "Sinethemba", 650)){
            System.out.println("Customer Sinethemba already exists.");
        }
    }
}
