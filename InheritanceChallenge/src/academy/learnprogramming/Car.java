package academy.learnprogramming;

public class Car extends Vehicle {
    // Instance Variables
    private String modelType;
    private String driveType;

    // Constructors
    public Car(String modelType, String driveType) {
        super("Straight", 1, 0);
        this.modelType = modelType;
        this.driveType = driveType;
    }

    // Getters and Setters
    public String getModelType() {
        return this.modelType;
    }
    public String getDriveType() {
        return this.driveType;
    }
}
