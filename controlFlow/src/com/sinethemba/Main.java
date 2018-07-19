package com.sinethemba;

public class Main {

    public static void main(String[] args){

        int switchValue = 2;

        switch (switchValue) {
            default:
                System.out.println("Sorry we dont have a case that matches that value");
                break;
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
        }


        char character = 'K';

        switch (character){
            case 'A':
                System.out.println("It was A");
                break;
            case 'B':
                System.out.println("It was B");
                break;
            case 'C':
                System.out.println("It was C");
                break;
            case 'D':
                System.out.println("It was D");
                break;
            case 'E':
                System.out.println("It was E");
                break;
            default:
                System.out.println("Sorry. We are not looking for that character");
                break;
        }

        //for statement / for loop
        for (int i = 8; i > 1; i--){
            System.out.println("The " + i + "% interest rate for R1000 is: R" + calculateInterest(1000,i));
        }

        //while statement / while loop
        int rate = 1;

        while(rate != 10){
            System.out.println(calculateInterest(1000,rate));
            rate++;
        }

        do {
            System.out.println(calculateInterest(1000,rate));
            rate++;
        }while(rate < 11);


    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
