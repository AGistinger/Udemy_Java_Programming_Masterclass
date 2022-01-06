package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * Read numbers from the console and print the min and max number the user entered
         * Before the user enters each number, print the message "Enter number:"
         * If the user enters a invalid number, break out of the loop and print min and max number
         */
        int min = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        boolean first = true;

        while(running) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();
                scanner.nextLine();

                // Set initial value of min to the first entered number
                if(first) {
                    min = number;
                    max = number;
                    first = false;
                }
                // Set min to the number if the number is less than current min
                if(number < min) {
                    min = number;
                }
                // Set max to the number if the number is greater than the current max
                if(number > max) {
                    max = number;
                }
            } else {
                printMinMaxValues(min, max);
                running = false;
            }
        }
        scanner.close();
    }

    public static void printMinMaxValues(int min, int max) {
        System.out.println("Minimum number is: " + min + ", Maximum number is: " + max);
    }
}
