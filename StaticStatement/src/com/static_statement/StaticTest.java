package com.static_statement;

/**
 * Static modifier
 * makes a member (variable or method) of a class independance of the objects
 * of the class.  This is used when we are defining properties that are common
 * to all objects of the class.
 *
 * Static methods can be referenced by using the class name instead of the instance
 * name.
 */
public class StaticTest {
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
