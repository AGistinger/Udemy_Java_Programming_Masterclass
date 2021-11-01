package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(120));
        System.out.println(getDurationString(15235));
        System.out.println(getDurationString(-5, -2));
    }

        /*
      Seconds and Minutes Challenge
      * Create a method called getDurationString with two parameters, minutes and
      seconds (ints).
      * You should validate that the first parameter minutes is >= 0
      * You should validate that the 2nd parameter seconds is >= 0 and <= 59
      * The method should return "invalid value" in the method if either of the above are not
      true.
      * If the parameters are valid then calculate how many hours, minutes and seconds, equal
      the minutes and seconds passed to this method and retrn that value as a string
      in formate "XXh YYm ZZs" where XX represents a number in hours, YY the minutes and ZZ
      the seconds.

      * Create a 2nd method of the same name but with only one parameter seconds.
      * Validate that it is >= 0 and return "invalid value" if it is not true.
      * If it is valid, then calculate how many minutes are in the seconds value and then call
      the other overloaded method passing the correct minutes and seconds calculate so
      that it can calculate correctly.
      * Call both methods to print to the console.

      Tips:
      * Use int or long for your number data types.
      * 1 minute = 60 seconds and  1 hour = 60 minutes or 3600 seconds.
      * Methods should be static.

      Bonus:
      * For the input 61 minutes the output should be 01h 01m 00s, but is okay if it is
      1h 1m 0s.
     */
    private static final String ERROR = "Invalid Value";
    public static String getDurationString(int minutes, int seconds) {
        if(minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes >= 60 ? minutes / 60 : 0;
            minutes %= 60;
            return String.format("%02d", hours) + "h " + String.format("%02d", minutes) +
                    "m " + String.format("%02d", seconds) + "s";
        }
        return ERROR;
    }

    public static String getDurationString(int seconds) {
        if(seconds >= 0) {
            int minutes = seconds >= 60 ? seconds / 60 : 0;
            seconds %= 60;
            return getDurationString(minutes, seconds);
        }
        return ERROR;
    }
}
