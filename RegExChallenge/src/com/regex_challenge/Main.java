package com.regex_challenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        String challenge2 = "I want a ball.";
        String regExp = "I want a \\w+.";
        System.out.println(challenge1.matches(regExp));
        System.out.println(challenge2.matches(regExp));

        String regExp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        String challenge4 = "Replace all blanks with underscores.";
        String regEx4 = "\\s";
        System.out.println(challenge4.replaceAll(regEx4, "_"));

        String challenge5 = "aaabccccccccccdddefffg";
        String regEx6 = "^a{3}bc{10}d{3}ef{3}g$";
        String regEx5 = ("[a-g]+");
        System.out.println(challenge5.matches(regEx5));
        System.out.println(challenge5.matches(regEx6));

        String challenge7 = "abcd.135";
        String challenge7b = "f5.12a";
        String regEx7 = "\\w{4}.\\d{3}$";
        System.out.println(challenge7.matches(regEx7));
        System.out.println(challenge7b.matches(regEx7));

        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern8 = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcher8 = pattern8.matcher(challenge8);

        while (matcher8.find()) {
            System.out.println("Occurrence: " + matcher8.group(1));
        }

        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern9 = Pattern.compile("[A-Za-z]\\.(\\d+)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);

        while (matcher9.find()) {
            System.out.println("Occurrence: " + matcher9.group(1));
        }

        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern10 = Pattern.compile("[A-Za-z]\\.(\\d+)\\s");
        Matcher matcher10 = pattern10.matcher(challenge10);

        while (matcher10.find()) {
            System.out.println("Occurrence: start = " + matcher10.start(1) + " end = " + (matcher10.end(1) -1));
        }

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}, {6, 34}, {11, 12}";
        Pattern pattern11 = Pattern.compile("(\\d+,\\s\\d+)");
//        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");

        Matcher matcher11 = pattern11.matcher(challenge11);
        while (matcher11.find()) {
            System.out.println("Occurrence: " + matcher11.group(1));
        }

        String zipCode = "11111";
        Pattern zipPattern = Pattern.compile("^\\d{5}$");
        Matcher zipMatcher = zipPattern.matcher(zipCode);
        System.out.println(zipMatcher.matches());

        String zipCode2 = "11111-1111";
        System.out.println(zipCode2.matches("^\\d{5}-\\d{4}$"));

        String zipRegEx = "(^\\d{5})(-\\d{4})?$";
        System.out.println(zipCode.matches(zipRegEx));
        System.out.println(zipCode2.matches(zipRegEx));
    }
}