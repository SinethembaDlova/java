package com.sinethemba;

public class VipCustomer {

    private  String name;
    private double credit_limit;
    private String email;

    public VipCustomer(){
        this("default name", 1000, "default email");
        System.out.println("You have created an empty constuctor.");
    }

    public VipCustomer(String name, String email){
        this(name, 500, email);
        System.out.println("You got a complimentary access. You defaul limit is R500" );

    }

    public VipCustomer(String name, double credit_limit, String email){
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
        System.out.println("Hi, you are a VIP and your limit is R" + credit_limit);
    }

    public String getName() {
        System.out.println("Hi, " + name);
        return name;
    }

    public double getCredit_limit() {
        System.out.println("Your credit limit is R" + credit_limit);
        return credit_limit;
    }

    public String getEmail() {
        System.out.println("Your email adress is " + email);
        return email;
    }
}
