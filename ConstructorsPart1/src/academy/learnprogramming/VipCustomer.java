package academy.learnprogramming;

public class VipCustomer {
    // Instance Variables
    private String name;
    private double creditLimit;
    private String emailAddress;

    // Constructors
    public VipCustomer() {
        this("Unknown", 0.00, "Unknown@email.com");
    }
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Unknown@gmail.com");
    }
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
