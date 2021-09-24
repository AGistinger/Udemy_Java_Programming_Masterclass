/*
Notes:
 (public)
 The public java keyword is an access modifier.  An access modifier
 allows us to define the scope or how other parts of your code can access
 this code.

(class)
 Defining a class.  The class keyword is used to define a class with the name
 following the keyword.

 (static)
 We need to have static for java to find our method to run the code we are going to add.

 (void)
 Java keyword to indicate that the method will not return anything.

 (Declaration Statement)
 Used to define a variable by indicating the data type, and the name, and optionally
 to set the variable to a certain value.

 (Expression)
 This is a construct that evaluates to a single value.
 */

public class Hello {

    public static void main(String[] args) {
        String name = "Adrianne";
        System.out.println("Hello, " + name);

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("My Total is " + myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println("My last number is " + myLastOne);
    }
}
