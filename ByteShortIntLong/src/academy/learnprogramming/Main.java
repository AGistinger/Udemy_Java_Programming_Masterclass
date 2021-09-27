package academy.learnprogramming;

/*
 (Wrapper classes)
 Java users the concept of a wrapper class for all eight primitive types.
 In the case of an int, we can use integer, and by doing that it gives us
 ways to perform operations on an int.

 (Casting)
 Casting means to treat or convert a number from one type to another.
 (byte) (myMinByteValue / 2)
 */
public class Main {

    public static void main(String[] args) {
        // Int types (Integer) / 32 bit
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntVAlue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntVAlue);

        // Turns into a negative number (overflowed value) BAD!
        System.out.println("Busted MAX value = " + (myMaxIntVAlue + 1));
        // Turns into a positive number (underflowed value) BAD!
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        // Byte type / 8 bit
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        // Short type / 16 bit
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        // Long type / 64 bit
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        // Casting
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}
