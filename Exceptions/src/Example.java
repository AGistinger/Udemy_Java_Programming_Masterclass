import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch(ArithmeticException | NoSuchElementException err) {
            System.out.println(err.toString());
            System.out.println("Unable to perform division, autopilot shutting down");
        }
    }

    private static int divide() {
        int x, y;
//        try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + ", y is " + y);
            return x / y;
//        } catch(NoSuchElementException err) {
//            throw new ArithmeticException("No suitable input");
//        } catch(ArithmeticException err) {
//            throw new ArithmeticException("Attempt to divide by zero");
//        }
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");

        while(true) {
            try {
                return scanner.nextInt();
            } catch(InputMismatchException err) {
                // go round again.  Read past the end of line
                scanner.nextLine();
                System.out.println("Please enter a number using only the digts 0 - 9");
            }
        }
    }
}
