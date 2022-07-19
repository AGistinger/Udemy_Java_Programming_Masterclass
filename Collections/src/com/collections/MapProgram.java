package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language, with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners all purpose symbolic instruction code");
        languages.put("Lisp", "Therein lies madness");
        System.out.println(languages.put("C++", "The best coding language")); // null (brand new key/value pair

        System.out.println(languages.get("Java"));

        // Checks key already exists
        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("=======================================");

//        languages.remove("Lisp"); // remove key/value

        // .remove() returns true/false
        if (languages.remove("Algol", "a family of algorithmic languages")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol note removed, key/value pair not found");
        }

        // replace
        if(languages.replace("Lisp", "Therein lies madness", "a functional programming language with imperitive features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
        System.out.println(languages.replace("Scala", "this will not be added"));



        // Loops all keys in the maps set of keys
        for(String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
