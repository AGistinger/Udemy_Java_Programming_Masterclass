package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        // overloaded method challenge
        double test1 = calcFeetAndInchesToCentimeters(1, 10);
        System.out.println("test1 = " + test1);
        double test2 = calcFeetAndInchesToCentimeters(30);
        System.out.println("test2 = " + test2);
        double test3 = calcFeetAndInchesToCentimeters(2, 0);
        System.out.println("test3 = " + test3);
        double test4 = calcFeetAndInchesToCentimeters(0, 10);
        System.out.println("test4 = " + test4);
        double test5 = calcFeetAndInchesToCentimeters(0, 13);
        System.out.println("test5 = " + test5);
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    /*
      Method Overloading challenge
      Create a method called calFeetAndInchesToCentimeters
      It needs to have two parameters
      feed is the first parameter, inches is the 2nd parameter.

      You should validate that the first parameter feeit is >= 0
      You should validate that the 2nd parameter inches is >=0 and <=12
      return -1 from the method if either of the above is not true

      If the parameters are valid, then calculate how many centimeters
      comprise the feet and inches passed into this method and return that value.

      Create a 2nd method of the same name but with only one parameter
      Inches is the parameter
      validate that it is >=0
      return -1 if it is not true
      But if it's valid, then calculate how many feet are in the inches
      and then here is the tricky part
      call the other overloaded method passing the correct feet and inches
      calculated so that it can calculate correctly.

      hints:
      Use double for your number datatypes is probably a good idea
      1 inch = 2.54 cm and one foot = 12 inches
      Use the link I gave you to confirm your code is calculating correctly
     */
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet >= 0 && inches >= 0 && inches <= 12) {
            return ((feet * 12) + inches) * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0) {
            double feet = Math.floor(inches >= 12 ? inches / 12 : 0);
            inches %= 12;
            return calcFeetAndInchesToCentimeters(feet, inches);
        }
        return 1;
    }
}
