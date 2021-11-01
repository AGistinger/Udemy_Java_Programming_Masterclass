package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        // For Loop
        for(int i = 0; i <= 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        /*
          Challenge:
          Using the for statement, call the calculateInterest method with the amount of 10000
          with an interestRate of 2, 3, 4, 5, 6, 7 and 8, then print the results to the console.
         */
        for(int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, (double) i)));
        }

        /*
          Challenge #2
          How would you modify the loop above to do the same thing, but start from 8% and go to 2%
         */
        for(int i = 8; i >=2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, (double) i)));
        }

        /*
          Challenge #3
           * Create a for statement using any range of numbers
           * Determine if the number is a prime number using the isPrime method
           * If it is a prime number, print it out And increment a count of the number
             of prime numbers found.
           * If that count is 3 exit the foor loop
         */
        int primeNums = 0;
        for(int i = 5; i <= 500; i++) {
            if(primeNums < 3 && isPrime(i)) {
                System.out.println(i + " is Prime");
                primeNums++;
            } else if (primeNums == 3) {
                System.out.println("Exiting for loop");
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= (long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}
