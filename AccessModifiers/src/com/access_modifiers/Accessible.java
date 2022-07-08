package com.access_modifiers;

/**
 * Challenge:
 * In the following interface declaration, what is the visibility of:
 * 1: the Accessible interface
 * 2: the int variable SOME_CONSTANT?
 * 3: methodA?
 * 4: methodB?
 */
interface Accessible { // package-private
    int SOME_CONSTANT = 100; // public static final
    public void methodA(); // public
    void methodB(); // public
    boolean methodC(); // public
}
