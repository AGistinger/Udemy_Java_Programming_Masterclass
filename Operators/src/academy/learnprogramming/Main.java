package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1
        result++; // increment
        System.out.println("1 + 1 = " + result);

        result--; // decrement
        System.out.println("2 - 1 = " + result);

        // result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3;
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2;
        System.out.println("10 - 2 = " + result);

        // If/Then statement
        boolean isAlien = false;
        if(!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore <= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;

        // Will not work expects a boolean value
//        if(newValue = 50) {
//            System.out.println("This is an error");
//        }

        boolean isCar = true;
        if(isCar) {
            System.out.println("This is a car");
        }

        // Ternary operator
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("Was car is true");
        }

        /*
          (Operator Challenge)
          1. Create a double variable with a value of 20.00.
          2. Create a second variable of type double with the value 80.00.
          3. Add both numbers together and mutlply by 100.00.
          3. Use the remainder operator to figure out what the remainder from the result of the
          operation in step 3 and 40.00.  We used the modulus or remainder operator in the ints course,
          but can also bue used on a double.
          5. Create a boolean variable that assigns the value true if the remainder is 0, or false if it
          is not 0.
          6. Output the boolean variable.
          7. Write a if-then statement that displays a message "Got some remainder" if the boolean
          in step 5 is not true.
         */
        double varA = 20.00;
        double varB = 80.00;
        double varC = ((varA + varB) * 100.00) % 40.00;
        boolean testTotal = varC == 0 ? true : false;
        System.out.println("Boolean value = " + testTotal);
        if(!testTotal) {
            System.out.println("Got some remainder!");
        }
    }
}
