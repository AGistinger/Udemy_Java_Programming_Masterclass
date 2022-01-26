package academy.learnprogramming;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
	    /*
	     Challenge:
	      * Create a new class for a bank account
	      * Create fields for the account number, balance, customer name, email, and phone number.
	      * Create getters and setters for each field
	      * Create two additional methods
	      * 1. To allow the customer to deposit funds (this should increment the balance field)
	      * 2. To allow the customer to withdraw funds. (this should deduct from the balance field)
	      * but will not allow the withdrawal to complete if there are insufficient funds.
	      * You will want to create various code in the main class (the one created by intelliJ)
	      * Add some System.out.println's in the two methods above as well.
	     */
		BankAccount myAccount = new BankAccount();
		myAccount.setAccountNumber(1234567);
		myAccount.setCustomerName("Adrianne Gistinger");
		myAccount.setBalance(5000.50);
		myAccount.setPhoneNumber("810-499-6435");
		myAccount.setEmail("agistinger@gmail.com");
		myAccount.deposit(500);
		myAccount.withdraw(10000.25);
		myAccount.withdraw(1500.25);

		BankAccount markAccount = new BankAccount(123678, 1000.00, "Mark S", "marks@gmail.com", "810-499-6435");
		markAccount.withdraw(50);

		BankAccount timsAccount = new BankAccount("Tim", "tim@emai.com", "12345");

		/*
		 Challenge #2
		  * Create a new class VipCustomer
		  * It should have 3 fields, name, credit limit, and email address
		  * Create 3 constructors
		  * 1st constructor empty should call the constructor with 3 parameters with default values
		  * 2nd constructor should pass on the 2 values it receives and add a default value for 3rd
		  * 3rd constructor should save all fields
		  * Create getters only for this using code generation of intellij as setters won't be need
		  * Test and confirm it works
		 */
		VipCustomer markVip = new VipCustomer();
		VipCustomer adrianneVip = new VipCustomer("Adrianne", 1000000.50, "Agistinger@gmail.com");
		VipCustomer gryphonVip = new VipCustomer("Gryphon", 5000.00);
		System.out.println(markVip.getCreditLimit());
		System.out.println(adrianneVip.getCreditLimit());
		System.out.println(gryphonVip.getCreditLimit());
    }
}
