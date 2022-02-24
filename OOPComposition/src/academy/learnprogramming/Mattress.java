package academy.learnprogramming;

public class Mattress {
    private String brand;
    private String type;
    private String size;

    public Mattress(String brand, String type, String size) {
        this.brand = brand;
        this.type = type;
        this.size = size;
    }

    public void mattressDetails() {
        System.out.println("Matress details, brand: " + this.brand + " type: " + this.type + " size: " + this.size);
    }
}
