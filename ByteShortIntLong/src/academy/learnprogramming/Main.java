package academy.learnprogramming;

/*
 (Wrapper classes)
 Java users the concept of a wrapper class for all eight primitive types.
 In the case of an int, we can use integer, and by doing that it gives us
 ways to perform operations on an int.
 */
public class Main {

    public static void main(String[] args) {
        // Int types (Integer)
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntVAlue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntVAlue);

        // Turns into a negative number (overflowed value) BAD!
        System.out.println("Busted MAX value = " + (myMaxIntVAlue + 1));
        // Turns into a positive number (underflowed value) BAD!
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        // Byte type
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
    }
}
