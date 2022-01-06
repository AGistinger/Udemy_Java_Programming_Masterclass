package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
          Reading user input challenge
          * Read 10 numbers from the console entered by the user and print the sume of those numbers
          * Create a scanner like we did in the previous video
          * Use the hasNextInt() method from the scanner to check if the user has entered an int value
          * If hasNextInt() returns false, print the message "Invalid Number"
          * Continue reading until you have 10 numbers
          * Use the nextInt(), method to get the number and add it to the sum
          * Before the user enters each number, print the message "Enter number#x:" where x represents count
          * Hint:
            * Use a while loop
            * Use a counter variable for counting the valid numbers
            * Close the scanner after you don't need it anymore
            * Create a project with the name ReadingUserInputChallenge
         */

        int counter = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while(counter < 10) {
            System.out.println("Enter number #" + (counter+1) + ":");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();
                scanner.nextLine(); // handle enter key
                sum += number;
                counter++;
            } else {
                System.out.println("Invalid Number");
                scanner.nextLine();
            }
        }

        System.out.println("Total sum of numbers is: " + sum);
        scanner.close();
    }
}
