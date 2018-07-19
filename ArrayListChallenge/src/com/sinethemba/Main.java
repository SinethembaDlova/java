package com.sinethemba;

import javax.naming.CannotProceedException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("081 325 1120");

    public static void main(String[] args) {


        boolean quit = false;
        startPhone();
        printInstructions();
        int choice = 0;

        while (!quit){
            System.out.println("Please select your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){

                default:
                    System.out.println("You have entered an invalid contact.");
                case 0: printInstructions();
                break;
                case 1: mobilePhone.printAllContacts();
                break;
                case 2: addContact();
                break;
                case 3: updateContact();
                break;
                case 4: deleteContact();
                break;
                case 5: searchContact();
                break;
                case 6: quit = true;
                break;
                case 7:
                    System.out.println("\n Phone is shutting down....");
                    quit = true;
                    break;
            }
        }

    }

    public static void startPhone(){
        System.out.println("Phone is starting......... ");
    }


    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print your choice options.");
        System.out.println("\t 1 - To show all your contacts");
        System.out.println("\t 2 - To add a contact.");
        System.out.println("\t 3 - To update a contact in the contact list.");
        System.out.println("\t 4 - To delete a contact in the contact list.");
        System.out.println("\t 5 - To search for a contact in the contact list.");
        System.out.println("\t 6 - To quit the program.");
        System.out.println("\t 7 - To shut down the phone.");
    }


    public static void addContact(){
        System.out.println("Please enter new contact name?");
        String name = scanner.nextLine();
        System.out.println("PLease enter phone?");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);

        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New contated added: name = " + name + " ,phone = " + phone);
        }
        else{
            System.out.println("Cannot add " + name + "'s contact already exist.");
        }
    }

    public static void updateContact(){
        System.out.println("Enter the contact name for the contact you want to change?");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null){
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Please enter new contact name?");
        String newName = scanner.nextLine();
        System.out.println("Please enter new phone number?");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        mobilePhone.updateContact(existingContactRecord, newContact);

        if (mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully updated the contact number.");
        }
        else{
            System.out.println("Error updating the old contact.");
        }



    }

    public static void deleteContact(){
        System.out.println("Enter the contact name for the contact you want to delete?");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null){
            System.out.println("Contact not found.");
            return;
        }

        if (mobilePhone.deleteContact(existingContactRecord)){
            System.out.println("Contact successfully deleted.");
        }

        else{
            System.out.println("Error deleting contact.");
        }

    }

    public static void searchContact(){
        System.out.println("Enter the contact name you want to search?");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null){
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name is " + existingContactRecord.getName() + "and phone number is " + existingContactRecord.getPhoneNumber());
    }
}
