package com.regex_example;

public class Main {
    public static void main(String[] args) {
        // Searches the string for upper or lower case and then makes the H upper
        System.out.println("Harry".replaceAll("[Hh]arry", "Harry"));

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        // if a ^ is inside [] will match all occurrences that are not ej in the case below
        System.out.println(alphanumeric.replaceAll("[^ej]", "X"));

        System.out.println(alphanumeric.replaceAll("[abcdef345678]", "X"));

        // - character specifies range, you don't need space or comma in between ranges
        System.out.println(alphanumeric.replaceAll("[a-f3-8]", "X"));

        // (?i) will ignore case sensitivity
        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]", "X"));

        // replace all numbers in string
        System.out.println(alphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(alphanumeric.replaceAll("\\d", "X"));
        System.out.println(alphanumeric.replaceAll("\\D", "X"));

        // remove white space
        String hasWhiteSpace = "I have blanks and\t a tab, and also a new line\n";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        System.out.println(hasWhiteSpace.replaceAll("\t", "X"));

        // Will remove all non-white space characters
        System.out.println(hasWhiteSpace.replaceAll("\\S", ""));

        // \\w will replace all characters (will ignore white space)
        System.out.println(alphanumeric.replaceAll("\\w", "X"));

        // \\b will match word boundaries
        System.out.println(hasWhiteSpace.replaceAll("\\b", "X"));

    }
}