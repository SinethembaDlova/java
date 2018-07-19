package com.sinethemba;

public class Password {

    private  static final int key = 735552368;
    private  final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password){
        return password ^ key;
    }

    public final void storePassword(){
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public  boolean letMeIn(int password){
        if (encryptDecrypt(password) == this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        }
        System.out.println("Nope, you cannot come in. Put the right password.");
        return false;
    }
}
