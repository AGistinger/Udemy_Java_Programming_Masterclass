package com.final_statement;

/**
 * all static blocks are called first.
 */
public class StaticInitializationBlock {
    public static final String owner;

    static {
        owner = "tim";
        System.out.println("Static Initialization Block called");
    }

    public StaticInitializationBlock() {
        System.out.println("Static Initialization Constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("Somemethod called");
    }
}
