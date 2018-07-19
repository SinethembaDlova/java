package com.sinethemba;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Sinethemba", 45);
        Customer anotherCustomer = customer;

        anotherCustomer.setBalance(15);
        System.out.println("Balance for customer " + customer.getName() + " is R" + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(5);
        intList.add(10);

        for(int i=0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        System.out.println("****");
        intList.add(1, 10);
        for(int i=0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }


    }
}