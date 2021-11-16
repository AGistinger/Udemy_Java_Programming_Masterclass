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

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));

        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println(reverse(-234));
        System.out.println(getDigitCount(100));
        System.out.println(getDigitCount(0));

        numberToWords(100);
        numberToWords(1450);
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

    public static boolean hasSameLastDigit(int numA, int numB, int numC) {
       if(isValid(numA) && isValid(numB) && isValid(numC)) {
            int lastA = numA % 10;
            int lastB = numB % 10;
            int lastC = numC % 10;

           return lastA == lastB || lastC == lastB || lastA == lastC;
       }
       return false;
    }

    public static boolean isValid(int num) {
        if(num >= 10 && num <= 1000) {
            return true;
        }
        return false;
    }

    /*
        If a = b, stop -- the GCD of aa and aa is, of course, aa. Otherwise, go to step 2.
        If a > b, replace aa with a - ba−b, and go back to step 1.
        If b > a, replace bb with b - ab−a, and go back to step 1.
     */
    public static int getGreatestCommonDivisor(int a, int b) {
        if(a >= 10 && b >= 10) {

            while(a != b) {
                if(a > b) {
                    a = a - b;
                }
                if(b > a)
                    b = b - a;
            }
            return a;
        }
        return -1;
    }

    public static void printFactors(int num) {
        if(num >= 1) {
            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static boolean isPerfectNumber(int num) {
        if(num >= 1) {
            int addedNum = 0;
            for(int i = 1; i < num; i++) {
                if(num % i == 0) {
                    addedNum += i;

                    if(addedNum == num) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void numberToWords(int num) {
        int reversed = reverse(num);
        int digits = getDigitCount(num);
        int reversedDigits = getDigitCount(reversed);

        if(num >= 1) {
            while(reversed > 0) {
                int lastDigit = reversed % 10;
                reversed /= 10;

                switch(lastDigit) {
                    case 1 :
                        System.out.println("One");
                        break;
                    case 2 :
                        System.out.println("Two");
                        break;
                    case 3 :
                        System.out.println("Three");
                        break;
                    case 4 :
                        System.out.println("Four");
                        break;
                    case 5 :
                        System.out.println("Five");
                        break;
                    case 6 :
                        System.out.println("Six");
                        break;
                    case 7 :
                        System.out.println("Seven");
                        break;
                    case 8 :
                        System.out.println("Eight");
                        break;
                    case 9 :
                        System.out.println("Nine");
                        break;
                    case 0 :
                        System.out.println("Zero");
                        break;
                }
            }

            if(reversedDigits < digits) {
                for(int i = reversedDigits; i < digits; i++) {
                    System.out.println("Zero");
                }
            }
        } else if(num == 0){
            System.out.println("Zero");
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int num) {
        int reversed = 0;
        boolean running = true;
        boolean isNegative = num < 0;

        if(isNegative) {
            num *= -1;
        }

        while (running) {
            if (num >= 10) {
                int lastDigit = num % 10;
                reversed += lastDigit;
                reversed *= 10;
                num /= 10;
            } else {
                reversed += num;
                running = false;
            }
        }
        return isNegative ? reversed *-1 : reversed;
    }

    public static int getDigitCount(int num) {
        int digits = 0;
        if(num == 0) {
            return 1;
        }
        if(num >= 0) {
            while (num > 0) {
                num /= 10;
                digits++;
            }
            return digits;
        }
        return -1;
    }
}
