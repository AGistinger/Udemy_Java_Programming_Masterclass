package academy.learnprogramming;
/*
 (Floating Point Numbers)
 Unlike whole numbers, floating point numbers have fractional parts that
 we express with a decimal point.  ex) 3.14159

 (Precision)
 precision refers to the format and amount of space occupied by the type.

 Single precision occupies 32 bits and Double precision occupies 64 bits.

 Double has more precision than float.
 */

public class Main {

    public static void main(String[] args) {
        // Float type
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = "+ myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        // Double type
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3; // Will drop decimal point
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        // Floating point Challenge
        /*
          Convert a given number of pounds to kilograms.
          1. Create a variable with the appropriate type to store the number of pounds
          to be converted
          2. Calculate the result i.e. the number of kilograms based on teh contents of the
          variable above and store the result in a 2nd appropriate variable.
          3. Print out the result
          HINT: 1 pound is equal to 0.45359237 of a kilogram.
         */
        double pounds = 108.5;
        final double KILOGRAM = 0.45359237;
        double poundsToKilogram = pounds * KILOGRAM;
        System.out.println("Pounds converted to Kilogram is: " + poundsToKilogram);
    }
}
