package com.sinethemba;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        printInstructions();

        while (!quit){
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0: printInstructions();
                break;
                case 1: groceryList.printGroceryList();
                break;
                case 2: addItem();
                break;
                case 3: updateItem();
                break;
                case 4: removeItem();
                break;
                case 5: searchItem();
                break;
                case 6: processArrayList();
                break;
                case 7: quit = true;
                break;

            }
        }

    }


    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print your choice options.");
        System.out.println("\t 1 - To print all the list of grocery");
        System.out.println("\t 2 - To add an item in the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item in the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To process the arra.");
        System.out.println("\t 7 - To quit the program.");
    }

    public static  void addItem(){
        System.out.print("Please enter a grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void updateItem(){
        System.out.print("Please enter a current item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Please enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.updateGroceryItem(itemName,newItem);
    }

    public static void removeItem(){
        System.out.print("Please enter item name: ");
        String itemName = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchItem(){
        System.out.print("Please enter an item to search for: ");
        String searchItem = scanner.nextLine();

        if (groceryList.onFile(searchItem)){
            System.out.print("We found " + searchItem + " in our grocery list.");
        }
        else{
            System.out.print(searchItem + " is not found in our grocery list.");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }


}
