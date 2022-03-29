package academy.learnprogramming;

import java.util.Arrays;

/**
 * Reference Types vs Value Types
 * Primitive types are value types they hold a value type.
 * Arrays are reference types and strings are reference types.
 *
 * A reference holds a address/reference to the object but not the object itself.
 */

public class Main {

    public static void main(String[] args) {
        // Value types
	    int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        // Reference types (use new keyword)
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; // Reference pointing to the same address in memory

        // Array.toString(array) allows an array to be printed in a formatted way
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        // Both variables will be changed
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));
    }
    // Functions
    private static void modifyArray(int[] array) {
        array[0] = 2;
        // Dereferences the original array and creates a new array (points to a different array)
        array = new int[] {1, 2, 3, 4, 5};
    }
}
