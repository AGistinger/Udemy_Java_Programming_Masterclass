package academy.learnprogramming;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	    /*
	      * Create a for loop using a range of numbers from 1 to 1000 inclusive.
	      * Sum all the numbers that can be divided with both 3 and 5.
	      * For those numbers that met the above conditions print out the number
	      * Break out of the loop once you find 5 numbers that meet the above conditions.
	      * After breaking out of the loop print the sum of the numbers that met the above conditions
	     */
        int count = 0;
        int sum = 0;

        for(int i = 1; i <= 1000; i++) {
            if(i % 3 == 0 && i % 5 == 0 && count < 5) {
                System.out.println(i + " can be divided by 3 and 5");
                sum += i;
                count++;
            } else if(count == 5) {
                break;
            }
        }

        System.out.println("The sum of all numbers that are divisable by 3 and 5 is " + sum);
        System.out.println(sumOdd(1, 11));
    }

    public static boolean isOdd(int num) {
        if(num <= 0) {
            return false;
        }
        return num % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if(end >= start && start > 0 && end > 0) {
            int sum = 0;
            for(int i = start; i <= end; i++) {
                if(isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
