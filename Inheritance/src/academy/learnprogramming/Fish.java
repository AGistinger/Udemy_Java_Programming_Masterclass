package academy.learnprogramming;

public class Fish extends Animal {
    // Instance Variables
    private int gills;
    private int eyes;
    private int fins;

    // Constructor
    public Fish(int size, int weight, String name, int gills, int eyes, int fins) {
        super(1, 1, size, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    // Functions
    private void rest() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }
}
