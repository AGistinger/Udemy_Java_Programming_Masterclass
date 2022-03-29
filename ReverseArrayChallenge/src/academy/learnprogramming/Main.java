package academy.learnprogramming;

import java.util.Arrays;

/**
 * Reverse Array Challenge
 * Write a method called reverse() with an int array as a paramter.
 * The method should not return any value.  In other words, the method is allowed to modify the
 * array paramter.
 * In main test the reverse method adn print the array both reversed and non-reversed.
 * To reverse the array, you have to swap the elements, so that the first element is swapped with the
 * last element and so on.
 */

public class Main {

    public static void main(String[] args) {
	    int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

    // Functions
    private static void reverse(int[] array) {
        int maxIndex = array.length-1;
        int halfLength = array.length/2;
        for(int i =0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }
}
