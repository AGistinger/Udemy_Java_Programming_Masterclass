package academy.learnprogramming;

public class Animal {
    // Instance Variables
    private int brain;
    private int body;
    private int size;
    private int weight;
    private String name;

    // Constructors
    public Animal(int brain, int body, int size, int weight, String name) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    // Getters
    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    // Methods/Functions
    public void eat() {
        System.out.println("Animal.eat() called");
    }

    public void move(int speed) {
        System.out.println("Animal.move() called.  Animal is moving at " + speed);
    }
}
