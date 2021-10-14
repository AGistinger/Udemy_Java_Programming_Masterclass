package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Statements
        int myVariable = 50; // entire line is a statement
        myVariable++;
        myVariable--;
        System.out.println("This is test");

        // White Space
        // Can write code over multiple lines
        System.out.println("This is" +
                " another" +
                " still more.");

        // can put multiple things on the same line as long as there is a semicolon
        // though you shouldn't do this as it is hard to read
        int anotherVariable = 50; anotherVariable--;

        // Indentation
        // code should be indented after method defintion or code block
        if(myVariable == 50) {
            System.out.println("Printed");
        }
    }
}
