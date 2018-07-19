package com.sinethemba;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //width of an int is 32 (4 bytes)
        int intValue = 10;

        //width of a float is 32 (4 bytes)
        float floatValue =  5F;

        //width of a doubt is 64 (8 bytes)
        double doubleValue = 5D;

        System.out.println(intValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);

        double pounds = 200D;
        double kgInPounds = pounds * 0.45359237;
        System.out.println("There is " + kgInPounds + " in " + pounds + " pounds.");
    }
}
