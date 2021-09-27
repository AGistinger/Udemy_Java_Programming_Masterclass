package academy.learnprogramming;

/*
  (String)
  A string is a sequence of characters.
  A class in Java.

  Strings in Java are immutable.  That means you can't change a string after
  it's created.  Instead, what happens is a new String is created.
 */

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // String data type
        String myString = "This is a string";
        System.out.println("MyString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("MyString is changed to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("MyString is changed to " + myString);

        String numberString = "250.55";
        numberString = numberString + " 49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
    }
}
