package com.sinethemba;

public class Main {

    public static void main(String[] args) {

//        System.out.println(calculateSum(2,4));
//        System.out.println(fullName("Sinethemmba", "Dlova"));
//        System.out.println(fullInitials('S','R',"Dlova"));

        calcFeetAndInchesToCentimeters(-15);
    }

    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public static String fullInitials(char init1, char init2, String lastName){
        return init1 + "." + init2  + " " + lastName;
    }

    //Overloading methods.

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >= 0) && ((inches >=0) && (inches <= 12))){
           double centimeters = (feet * 12) * 2.54;
           centimeters += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + "cm.");
            return centimeters;
        }

        else{
            System.out.println("Invalid inputs");
            return -1;
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches > 0){
            double feet = (int) inches/12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);

        }

        else{
            System.out.println("Invalid input");
            return -1;
        }
    }
}
