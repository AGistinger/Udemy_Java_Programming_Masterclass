package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // Switch statement
        int value = 1;

        switch(value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4: case 5:
                System.out.println("Was a 3, or 4, or 5");
                break;
            default:
                System.out.println("Value was not 1-5");
                break;
        }

        /*
          Switch Challenge:
          * Create a new switch statement using char instead of int
          * Create a new char variable
          * Create a switch statement testing for
          * A, B, C, D, E
          * Display a message if any of these are found and then break
          * Add a default which displays a message saying not found
         */
        char testChar = 'E';

        switch(testChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(testChar + " was found");
                break;
            default:
                System.out.println("Not found");
                break;
        }

        String month = "January";

        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
