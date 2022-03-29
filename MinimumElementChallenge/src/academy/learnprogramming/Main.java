package academy.learnprogramming;

import java.util.Scanner;

/**
 * Minimum Element Challenge
 * Write a method called readIntegers() with a parameter called count that represents how many
 * integers the user needs to enter.
 * The method needs to read from the console until all the numbers are entered, and then return
 * an array continaing the numbers entered.
 * Write a method called findMin() with the array as a parameter.  The method needs to return the
 * minimum value in the array.
 * In the main() method read the count from the console and call and call the method readIntegers() with
 * the count parameter.
 * Then call the findMin() method passing the array returned from the call to the readIntegers() method.
 * Finally, print the minimum element in the array.
 */

public class Main {

    // Read input from the console (it is static so that other static methods can see this variable)
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:\r");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] myValues = readIntegers(count);
        int minValue = findMin(myValues);
        System.out.println("The minimum value is: " + minValue);
    }

    // Functions
    private static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " numbers:\r");
        int[] values = new int[count];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return values;
    }

    private static int findMin(int[] array) {
        int min = 0;

        for(int i = 0; i < array.length; i++) {
            if(i == 0) {
                min = array[i];
            } else {
                if(array[i] < min) {
                    min = array[i];
                }
            }
        }
        return min;
    }

    // Instructors solution
    private static int findMinimum(int[] array) {
        int min = Integer.MAX_VALUE; // sets min to the max value

        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
