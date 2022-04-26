package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Array List
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;

        // Setting another customer to the original customer (doesn't create a new class)
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);

        // Changing the 2nd objects balance will affect the original objects balance as they point to the same address
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        intList.add(1, 2); // adds the 2nd number into the the index specified in the first number

        for(int i=0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        // Linked List
        /**
         * Can be primitive types and objects
         * Linked lists point the objects next to them
         */

    }
}
