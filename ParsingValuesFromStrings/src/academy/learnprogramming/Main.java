package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        /*
           Using a Class called Integer
           It is a wrapper class for Int
           It contains some useful static methods
           parseInt will take an arguement and try and convert it into an int
           if the conversion fails you will get an error.
         */
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1; // concatenates number
        number++; // adds one

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        double numberb = Double.parseDouble(numberAsString);
        System.out.println("numberb = " + numberb);

        System.out.println(getLargestPrime(21)); // 7
        System.out.println(getLargestPrime(217)); // 31
        System.out.println(getLargestPrime(0)); // -1
        System.out.println(getLargestPrime(45)); // 5
        System.out.println(getLargestPrime(-1)); // -1

        printSquareStar(5);
        printSquareStar(8);
    }

    public static int getLargestPrime(int number) {
        if(number > 1) {
            int largestPrime = 0;
            for(int i = 2; i <= number; i++) {
                while(number % i == 0) {
                    number /= i;
                    largestPrime =  i;
                }
            }
            return largestPrime;
        }
        return -1;
    }

    public static void printSquareStar(int number) {
        if(number >= 5) {
            for(int i = 1; i <= number; i++) {
                for(int j = number; j > 0; j--) {
                    if(i == number || i == 1 || j == number || j == 1 || j == i || j == number - i + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
