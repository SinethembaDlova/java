package com.sinethemba;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numbersArray =  new int [10];


        numbersArray[8] = 87;
        System.out.println("At index 7 we have value: " + numbersArray[8] + "\n");

        //loops with arrays
        for (int i = 0; i < numbersArray.length; i++){
            numbersArray[i] = i*10;
            System.out.println("The value at index " + i + " is: " + numbersArray[i] + "\n");
        }
        printNumbers(numbersArray);


        //print numbers that came though Scanner
        int[] scannerArray = getNumbers(5);
        for (int i = 0; i < scannerArray.length; i++){
            System.out.println("At index " + i + " we have value: " + scannerArray[i]);
        }

        //print Average
        System.out.println("The average of array is: " + getAvarage(scannerArray));
    }



    //methods with arrays
    public static void printNumbers(int[] array){
        for (int i = 0 ; i < array.length; i++){
            System.out.println("The value at index " + i + " is: " + array[i]);
        }
    }


    //enter numbers through a Scanner
    public static int[] getNumbers(int number){
        System.out.println("Please enter " + number + " integer values \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAvarage(int[] arr){
        int sumTotal = 0;
        for (int i = 0; i <  arr.length; i++){
            sumTotal += arr[i];
        }

        return (double) (sumTotal/arr.length);
    }
}
