package academy.learnprogramming;

public class Vehicle {
    // Instance Variables
    private String steering;
    private int gear;
    private int speed;

    // Constructor
    public Vehicle(String steering, int gear, int speed) {
        this.steering = steering;
        this.gear = gear;
        this.speed = speed;
    }

    // Getters & Settingers
    public String getSteering() {
        return this.steering;
    }
    public int getGear() {
        return this.gear;
    }
    public int getSpeed() {
        return this.speed;
    }
    public void setSteering(String steering) {
        this.steering = steering;
    }
    public void setGear(int gear) {
        this.gear = gear;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Functions
    public boolean moving() {
        return this.speed > 0;
    }
    public void changeGears(int gear) {
        setGear(gear);
    }
}
