package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(5127));

        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(-222));

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(5));

        System.out.println(getEvenDigitSum(123456789));

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 13));
        System.out.println(hasSharedDigit(12, 43));
    }

    /*
       Digit Sum Challenge
        * Write a method with the name sumDigits that has one int parameter called number
        * If parameter is >= 10 then the method shold process the number and return the sum
          of all digits, otherwise return -1 to indicated an invaild value.
        * The numbers from 0 - 9 have 1 digit so we don't have to process them, also we don't want
          to process negative numbers, so also return -1 for negative numbers.
        * Example sumDigits(125) should return 8 sine 1 + 2 + 5 = 8.
        * Calling method sumDigits(1) should return -1.
        * Add some code to the main method to test the sumDigits method.

        Hint:
         * Use n % 10 to extract the least-significant digit.
         * Use n = n / 10 to discard the least-significant digit.
         * The method needs to be static like other methods so far in this course.
     */
    public static int sumDigits(int number) {
        if(number >= 10) {
            int total = 0;
            boolean running = true;

            while(running) {
                // Extract least-significant digit
                total += (number % 10);
                // Drop least-significant digit
                number /= 10;
                if(number < 10) {
                    total += number;
                    running = false;
                }
            }
            return total;
        }
        return -1;
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNum = Math.abs(number);
        boolean running = true;

        while(running) {
            if(originalNum > 0) {
                int lastDigit = originalNum % 10;
                reverse *= 10;
                reverse += lastDigit;
                originalNum /= 10;
            } else {
                running = false;
            }
        }

        return reverse == Math.abs(number);
    }

    public static int sumFirstAndLastDigit(int number) {
        if(number >= 0) {
            boolean running = true;
            int lastDigit = number % 10;
            int total = 0;
            while(running) {
                if(number >= 10) {
                    number /= 10;
                }
                if(number < 10) {
                    total = number + lastDigit;
                    running = false;
                }
            }
            return total;
        }
        return -1;
    }

    public static int getEvenDigitSum(int number) {
        if(number >= 0) {
            int total = 0;
            boolean running = true;

            while(running) {
                int lastNum = number % 10;

                if(lastNum % 2 == 0) {
                    total += lastNum;
                }

                if(number > 10) {
                    number /= 10;
                } else {
                    running = false;
                }
            }
            return total;
        }
        return -1;
    }

        public static boolean hasSharedDigit(int num1, int num2) {
            if(num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {

                    // Loop over first number and turn into digits
                    while(num1 > 0) {
                        int lastDigit1 = num1 % 10;
                        num1 /= 10;

                        // Loop over second number and turn into digits
                        while(num2 > 0) {
                            int lastDigit2 = num2 % 10;
                            num2 /= 10;

                            // check if digits are equal
                            if(lastDigit1 == lastDigit2) {
                                return true;
                            }
                            // check if remaining numbers are equal
                            if(num1 == num2) {
                                return true;
                            }
                        }
                    }
            }
            return false;
        }

        public int boolean hasSameLastDigit(int numA, int numB, int numC) {

    }
}
