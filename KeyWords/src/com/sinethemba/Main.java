package com.sinethemba;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
        
//        StaticTest firstInstance = new StaticTest("First Instance");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("Second Instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("Third Instance");
//        System.out.println(thirdInstance .getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest forthInstance = new StaticTest("Forth Instance");
//        System.out.println(forthInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//        multiply(5);
//
//        System.out.println("********************");
//
//        SomeClass  one = new SomeClass("One");
//        SomeClass two = new SomeClass("Two");
//        SomeClass three = new SomeClass("Three");
//
//        System.out.println("\n" + one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        int pw = 10111;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(12);
//        password.letMeIn(23432);
//        password.letMeIn(pw);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }

    public static int multiply(int number){
        System.out.println(number + " multiply by " + multiplier + " is: " + (number * multiplier));
        return  number * multiplier;
    }
}
