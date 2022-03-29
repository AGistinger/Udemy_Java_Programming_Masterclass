package academy.learnprogramming;

import java.util.Scanner;

/**
 * Arrays
 * An array is a data structure that allows you to store multiple values of the same type into
 * a single variable.
 * The default values of numeric array elements are set to zero.
 * Arrays are zero indexed: an array with n elements is indexted from 0 to n-1,
 * example) 10 elements range from 0 to 9.
 * If we try to access an index that is out of range Java will give us an ArrayIndexOutOfBoundsException,
 * which indicates that the index is out of range in other words out of bounds.
 * To access array elements we use the square braces [and], also known as array access operator.
 * The new operator or keyword is used to create teh array and initialize the array elements to default
 * values.
 *  for int arrays are initialized to zero.
 *  for boolean arrays are initialized to false.
 *  for String and other objects are initialized to null.
 * We can also initialize an array inline by using array initalizer block {and}. Values defined are
 * separated by a comma.
 * 
 */

public class Main {

    // Reads input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Array, starts at position 0
//        int[] myIntArray = new int[10];
//        myIntArray[0] = 45;
//        myIntArray[1] = 476;
//        myIntArray[5] = 50;

        // Different way to create new array with values defined
        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double[] myDoubleArray = new double[10];

        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[6]);
        System.out.println(myIntArray[8]);

        // Another way to initialize
        int[] myIntArray2 = new int[10];
        for(int i = 0; i < myIntArray2.length; i++) {
            myIntArray2[i] = i * 10;
        }
        printArray(myIntArray2);

        // Real world use of an Array
        int[] myIntegers = getIntegers(5);

        for(int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("The Average is: " + getAverage(myIntegers));
    }

    // Functions
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " , value is " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values:\r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        // Cast type to double (default is float)
        return (double) sum / (double) array.length;
    }
}
