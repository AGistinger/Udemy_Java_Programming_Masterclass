package com.final_statement;

/**
 * Marking methods as final prevents them from being overriden by subclasses.
 * Marking constructor as final prevents people from instantiated instances of class.
 */

public class Main {
    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        System.out.println(Math.PI); // public static final double
//
//        int pw = 674312;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//        password.letMeIn(1);
//        password.letMeIn(0);
//        password.letMeIn(523266);
//        password.letMeIn(-1);
//        password.letMeIn(674312);

        System.out.println("Main method called");
        StaticInitializationBlock test = new StaticInitializationBlock();
        test.someMethod();
        System.out.println("Owner is " + StaticInitializationBlock.owner);
    }
}