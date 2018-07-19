package com.sinethemba;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("print");

    public static void main(String[] args) {

//        Gearbox mcLaren = new Gearbox(6);
//
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));

//        class ClickListener implements Button.OnClickListener{
//            public ClickListener() {
//                System.out.println("I have been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + "was clicked.");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + "was cliked");
            }
        });
        listen();
    }

    private static void listen() {

        boolean quit = false;
        //printInstructions();
        int choice = 0;

        while (!quit){
            System.out.println("Please select your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){

                default:
                    System.out.println("You have entered an invalid contact.");
                case 0: quit = true;
                case 1: btnPrint.onClick();
                    break;
            }
        }
    }
}
