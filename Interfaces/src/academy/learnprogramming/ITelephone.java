package academy.learnprogramming;

/**
 * The interface will declare methods that will later be defined in a class.
 * The methods cannot be changed.
 * Creating method signatures.
 * You don't write code in the interface, you write code in the class.
 * When defining a interface put an "I" in front of the interface name.
 * A class can implement multiple interfaces, but can only inherit from one base class.
 */

public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
