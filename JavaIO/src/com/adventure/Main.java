package com.adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Adventure Game Challenge
 * Change the prograom to allow players to type full words, or phrases, then move to the
 * correct location based on their input.
 * The player should be able to type commands such as "Go West", "run South", or just "East"
 * and the program will move to the appropriate location if there is one.  As at present, an
 * attempt to move in an invalid direction should print a message and remain in the same place.
 * Single letter commands (N, W, S, E, Q) should still be available.
 */

public class Main {
    private static Locations locations = new Locations();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Locations
        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exists are: ");
            for(String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1) {
                String[] words = direction.split(" ");
                for(String word : words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }
//            direction = parseDirection(direction);
            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");

            }
        }

//        String[] road = "You are standing at the end of a road before a small brick building".split(" ");
//        for(String i : road) {
//            System.out.println(i);
//        }
//
//        String[] building = "You are inside a building, a well house for a small spring".split(", ");
//        for(String i : building) {
//            System.out.println(i);
//        }
    }
    public static String parseDirection(String input) {
        if(input.length() > 1) {
            String[] instructions = input.split(" ");
            for(String word : instructions) {
                switch (word) {
                    case "QUIT":
                        return "Q";
                    case "NORTH":
                        return "N";
                    case "EAST":
                        return "E";
                    case "SOUTH":
                        return "S";
                    case "WEST":
                        return "W";
                }
            }
        }
        return input;
    }
}