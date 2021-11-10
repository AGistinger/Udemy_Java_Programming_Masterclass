package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // While Loop
        int count = 0;
        while(count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 0;
        while(true) {
            if(count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        // Do While Loop
        // Do while loop will always execute at least once
        count = 0;
        do{
            System.out.println("Count value was " + count);
            count++;

            if(count > 100) {
                break;
            }
        } while(count != 6);


        int number = 4;
        int finishNum = 20;
        int totalEven = 0;

        while(number <= finishNum) {
            number++;
            if (!isEvenNumber((number))) {
                // continue, interupts the code by going back to the start of the loop
                continue;
            }
            totalEven++;
            System.out.println("Even number " + number);

            if(totalEven == 5) {
                System.out.println("The total of even numbers is " + totalEven);
                break;
            }
        }

        /*
          modify the while code above
          Make it also record the total number of even number it has found
          and break once 5 are found.
          At the end display total number of even numbers found
         */
    }

        /*
          Create a method called isEvenNumber that takes a parameter of the type int
          Its purpose is to determine if the arguement passed to the method is an even number
          or not.  Return true if an even number.
         */
    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}
