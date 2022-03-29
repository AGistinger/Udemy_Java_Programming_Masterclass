package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Imports data from the keyboard
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * Array Challenge
         * Create a program using arrays that sorts a list of integers in decending order.
         * Decending order is highest value to lowest.
         * Ultimately have an array with 106, 81, 26, 15, 5 in it.
         * Set up the program so that the numbers to sort are read in from the keyboard.
         * Implement the following methods - getIntegers, printArray, and sortIntegers.
         * getIntegers returns an array of entered integers from keyboard.
         * printArray prints out the contents of the array.
         * sortIntegers should sort the array and return a new array containing the sorted numbers
         * you will have to figure out how to copy the array elements from the passed array into a
         * new array and sort them and return the new sorted array.
         */
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        printArray(sortIntegers(myIntegers));
        printArray(sortInts(myIntegers));
    }

    // Functions
    // Gets integeters from the scanner from the user's input
    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " integer values:\r");
        int[] values = new int[capacity];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    // Prints each element of the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    // Sorts the arrays in decending order
    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];

        // Loops through new array
        for (int i = 0; i < sortedArray.length; i++) {
            int largest = 0;
            // Loops through the original array to find the largest element saves the new largest
            for (int j = 0; j < array.length; j++) {
                if(i == 0) {
                    if (array[j] > largest) {
                        largest = array[j];
                    }
                } else {
                    if(array[j] < sortedArray[i-1]) {
                        if(array[j] > largest) {
                            largest = array[j];
                        }
                    }
                }
                sortedArray[i] = largest;
            }
        }
        return sortedArray;
    }

    // Instructors solution of Sort array
    public static int[] sortInts(int[] array) {

        // Copy the original array
//        int[] sortedArray = new int[array.length];
//        for(int i= 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        // Copy the original array different way
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            // element 0 - 50
            // element 1 - 160
            // element 2 - 40
            // If the current element is less than the next element then swap the elements
            for(int i = 0; i < sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}