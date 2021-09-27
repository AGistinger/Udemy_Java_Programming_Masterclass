package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Primitive type challenge
        /*
        Create a byte variable and set it to any valid byte number.
        Create a short variable and set it to any valid short number.
        Create an int variable and set it to any valid int number.
        Lastly, Create a variable of tyep long and make it equal to 50000,
        plus 10 times the sum of byte plus the short plus the integer
        values.
         */
        byte byte_a = 50;
        short short_a = 500;
        int int_a = 5000;
        long long_a = (long) (50000 + 10 * (byte_a + short_a + int_a));
        System.out.println("Challenge answer is: " + long_a);
    }
}
