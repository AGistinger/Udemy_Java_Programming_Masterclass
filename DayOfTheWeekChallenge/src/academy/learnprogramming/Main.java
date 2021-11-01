package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        /*
          Day of the Week Challenge
          * Write a method with the name printDayOfTheWeek that has one parameter of type
          int and name it day.
          * The method should not return a value.
          * Using a switch statement print "Sunday", "Monday", .. "Saturday", if the int parameter
          "day" is 0, 1, .. 6, respectively, otherwise it should print "Invalid day".

          Bonus:
          * Write a second solution using the if then else, instead of using the switch.
          * Create a new project with the name DayOfTheWeekChallenge
         */
        printDayOfTheWeek(2);
        printDayOfTheWeek(7);

        printDayOfTheWeek2(2);
        printDayOfTheWeek2(7);
    }

    private static void printDayOfTheWeek(int day) {
        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    private static void printDayOfTheWeek2(int day) {
        if(day == 0) {
            System.out.println("Sunday");
        } else if(day == 1) {
            System.out.println("Monday");
        } else if(day == 2) {
            System.out.println("Tuesday");
        } else if(day == 3) {
            System.out.println("Wednesday");
        } else if(day == 4) {
            System.out.println("Thursday");
        } else if(day == 5) {
            System.out.println("Friday");
        } else if(day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
