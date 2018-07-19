package com.sinethemba;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map< String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")){
            System.out.println("Java is already in the map.");
        }
        else {
            languages.put("Java", "Strongly typed, object oriented, platform independent language.");
            System.out.println("Java was added successfully.");
        }

        languages.put("Phython", "An interpreted, object oriented, high level programing language with dynamic semantics.");
        languages.put("Algol", "An algorithmic language.");
        languages.put("Lisp", "Strongly typed, Therein lies madness.");

        System.out.println(languages.get("Java"));
        if (languages.containsKey("Java")){
            System.out.println("Java is already in the map.");
        }
        else{
            languages.put("Java", "Strongly typed language that's loved by many.");
        }

        System.out.println(languages.get("Java"));

        System.out.println("*****************************************************");

        //languages.remove("Lisp");
        if (languages.remove("Algol", "An algorithmic language.")){
            System.out.println("Algol removed.");
        }
        else{
            System.out.println("Algol was not removed. A matching key/pair was not found.");
        }

        if (languages.replace("Lisp", "Strongly typed, Therein lies madness.",
                "A functional programing languge with imperative failure.")){
            System.out.println("Lisp was replaced.");
        }
        else {
            System.out.println("Lisp was not replaced.");
        }
        System.out.println(languages.replace("Scala", "Functional programming language."));
        System.out.println("*****************************************************");
        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
