package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

//    private static Scanner s = new Scanner(System.in);
//    private static int[] baseData = new int[10];
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
//	    System.out.println("Enter 10 integers:");
//        getInput();
//        printArray(baseData);
//        resizeArray();
//        System.out.println("Enter 12 integers:");
//        getInput();
//        printArray(baseData);

        // Array List
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item inthe list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter the item to be modified: ");
        String item = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(item, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in your grocery list.");
        } else {
            System.out.println(searchItem + " is not in teh shopping list.");
        }
    }

    public static void processArrayList() {
        // Copy arrayList
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        // Copy arrayList
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        // Copy arrayList and make it a regular array
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

//    private static void getInput() {
//        for(int i = 0; i < baseData.length; i++) {
//            baseData[i] = s.nextInt();
//        }
//    }
//
//    private static void printArray(int[] arr) {
//        System.out.println(Arrays.toString(arr));
//    }
//
//    // Save the original array, initialize the new array then copy the original values
//    private static void resizeArray() {
//        int[] original = baseData;
//
//        baseData = new int[12];
//        for(int i = 0; i < original.length; i++) {
//            baseData[i] = original[i];
//        }
//    }
}
