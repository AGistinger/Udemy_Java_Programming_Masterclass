package academy.learnprogramming;

/*
  (Unicode)
  Is an internation encodig standard for use with different
  languages and scripts, by which each letter, digit, or symbol
  is assigned a unique numeric value that applies across
  different platforms or programs.
 */
public class Main {

    public static void main(String[] args) {
        // Char data type / 16 bit
	    char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        // Boolean data type
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;
    }
}
