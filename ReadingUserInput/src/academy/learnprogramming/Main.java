package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
          Built in class that will read user input
          "new" allows you to create new instance of Scanner
          After you use the scanner, you have to close the scanner as this will release memory

          What if the user enters a negative number?
          Need to add a condition to check range of numbers

          What if the user enters letters instead of numbers?
          Need to add a condition to check for type
         */
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt(); // checks if next entry is a int

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.println(("Enter your name:"));
            String name = scanner.nextLine();

            int age = 2022 - yearOfBirth;

            if(age >= 0 && age < 100) {
                System.out.println("Your name is " + name + ", and your age is " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        inputThenPrintSumAndAverage();
        System.out.println("Number of buckets needed to buy: " + getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println("Number of buckets needed to buy: " + getBucketCount(3.4, 2.1, 1.5));
        System.out.println("Number of buckets needed to buy: " + getBucketCount(3.26, 0.75));
        scanner.close();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long avg = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running) {
            System.out.println("Enter a number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();
                scanner.nextLine();
                count++;

                sum+= number;
                avg = Math.round((double) sum / count);
            } else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                running = false;
            }
        }
        scanner.close();
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0) {
            double area = width * height;
            return (int) Math.ceil((area / areaPerBucket) - extraBuckets);
        }
        return -1;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width > 0 && height > 0 && areaPerBucket > 0) {
            double area = width * height;
            return (int) Math.ceil(area / areaPerBucket);
        }
        return -1;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(area > 0 && areaPerBucket > 0) {
            return (int) Math.ceil(area / areaPerBucket);
        }
        return -1;
    }
}
