package academy.learnprogramming;

public class BankAccount {
    // Instance variables
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Constructors
    public BankAccount() {
        this(111111, 0.0, "Default Name", "unknown@gmail.com", "000-000-0000");
    }
    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, 100.55, customerName, email,phoneNumber);
    }

    // Getters & Setters
    public int getAccountNumber() { return this.accountNumber; }
    public double getBalance() { return this.balance; }
    public String getCustomerName() { return this.customerName; }
    public String getEmail() { return this.email; }
    public String getPhoneNumber() { return this.phoneNumber; }
    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }
    public void setBalance(double balance) { this.balance = balance; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // Methods
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Your new balance is: " + this.balance);
    }
    public void withdraw(double amount) {
        if(amount > this.balance) {
            System.out.println("Sorry insufficient funds to make this withdrawal");
        } else {
            this.balance -= amount;
            System.out.println("Your new balance is: " + this.balance);
        }
    }
}
