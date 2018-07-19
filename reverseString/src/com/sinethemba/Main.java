package com.sinethemba;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

//        reverse("abcdefg");
//        checkIfPalindromes("srdadcsdescar");

//        int[] number = {1,10, 50, 30, 50, 2, 14};
//        sortNumbers(number);

        DiceRollSimulator myDice = new DiceRollSimulator();
        myDice.roll();

    }

    public static void reverse(String stringData){

        System.out.println(stringData);

        char[] out = stringData.toCharArray();

        for (int i = 0 ; i < (stringData.length()/2) ; i++){

            char firstChar = out[i];
            char secondChar = out[stringData.length()-i-1];

            out[i]= secondChar;
            out[stringData.length()-i-1] = firstChar;
        }
        System.out.println(out);
    }

    public static int[] sortNumbers( int[] array){

        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;

            for (int i = 0; i < sortedArray.length-1; i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        System.out.println("In the sorted list: ");
        for (int i = 0; i< sortedArray.length; i++){
            System.out.println(sortedArray[i]);

        }
        return sortedArray;
    }

    public static boolean checkIfPalindromes(String stringData){

        System.out.println(stringData);
        char[] out = stringData.toCharArray();

        for (int i = 0 ; i < (stringData.length()/2) ; i++){

            char firstChar = out[i];
            char secondChar = out[stringData.length()-i-1];

            if (firstChar == secondChar) {
                out[i] = secondChar;
                out[stringData.length() - i - 1] = firstChar;
                System.out.println("The string is a palindromes.");
            }
            else {
                System.out.println("The string is not a palindromes");
                return false;
            }
        }
        System.out.println("The string is a palindromes");
        return true;
    }


}
