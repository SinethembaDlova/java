package com.sinethemba;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int sum = 10 + 15;
        int difference = 2018 - 1971;
        int product = 20 * 2;
        int dividend = 20/3;
        int remainder = 20%3;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(dividend);
        System.out.println(remainder);


        if (sum > difference) System.out.println("Great!");
        else System.out.println("Add more to the sum!");

        if (sum + remainder > dividend) System.out.println("Sum stay winning");
        else System.out.println("Come on now");

        //challenge

        double num1 = 20;
        double num2 = 80;
        double results = (num1 + num2) * 25;
        double checkRemainder = (num1 + num2) % 40;

        if (checkRemainder <= 20) System.out.println("Total was over the limit");

        System.out.println();
    }
}


