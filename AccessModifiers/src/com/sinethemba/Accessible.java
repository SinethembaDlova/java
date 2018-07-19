package com.sinethemba;

interface Accessible {

    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();

    /*The interface is private package, Its only accessible to the classes with the same package in it.
    All members of the interface are public
     */
}

