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
        Vector<Integer> v = new Vector<>();

        for(int i = 1; i <= 1000; i++) {
            if(i % 3 == 0 && i % 5 == 0 && count < 5) {
                System.out.println(i + " can be divided by 3 and 5");
                v.add(i);
                count++;
            } else if(count == 5) {
                break;
            }
        }

        int sum = 0;
        for(int num : v) {
            sum+= num;
        }
        System.out.println("The sum of all numbers that are divisable by 3 and 5 is " + sum);
    }
}
