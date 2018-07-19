package com.sinethemba;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player sinethemba = new Player("Sinethemba", 10, 20);
        System.out.println(sinethemba);
        saveObject(sinethemba);
        System.out.println("*****************");

        //loadObject(sinethemba);

        ISaveable nkunzi = new HitMan("Nkunzi", 10, 10);
        System.out.println(nkunzi);
        saveObject(nkunzi);

    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Choose\n" +
        "1 - to enter a string.\n" +
        "0 - to quit.");

        while (!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){

                case 0: quit = true;
                break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for (int i = 0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void  loadObject(ISaveable objecToLoad){

      ArrayList<String> values = readValues();
      objecToLoad.read(values);
    }
}
