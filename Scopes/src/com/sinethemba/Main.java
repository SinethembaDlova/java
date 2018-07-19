package com.sinethemba;

public class Main {

    public static void main(String[] args) {

        String varFour = "This is private to Main()";

        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.useInner();

        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        System.out.println("varThree is not accessible here " + innerClass.varThree);

//        scopeCheck.getVarOne();
//        System.out.println(varFour);
//
//        System.out.println("***************************");
//
//        scopeCheck.timesTwo();
//
//        System.out.println("***************************");
//        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
//        innerClass.timesTwo();
    }
}
