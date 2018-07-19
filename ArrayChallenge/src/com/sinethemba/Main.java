package com.sinethemba;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] numbers = getNumbers(5);
        printArr(numbers);
        int[] sorted = sortNumbers(numbers);
        printArr(sorted);
    }

    public static int[] getNumbers(int size){

        int[] array = new int[size];
        System.out.println("Please enter " + size + " number values");

        for (int i=0; i< array.length; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArr(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("At index " + i + " we have value " + array[i]);
        }
        System.out.println("\r");
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

        System.out.println("In the sorted list: \n");
        return sortedArray;
    }
}
