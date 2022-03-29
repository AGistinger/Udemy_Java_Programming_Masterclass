package academy.learnprogramming;

import java.util.Vector;

public class Burger {
    private  String breadRollType;
    private String meat;
    private Vector<String> additions = new Vector<String>();
    private double basePrice;
    private String name;
    private double additionPrice = 1.50;

    public Burger(String breadRollType, String meat, double basePrice, String name) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.name = name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public Vector<String> getAdditions() {
        return additions;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }

    public void addAddition(String addition) {
        if(this.additions.size() < 4) {
            this.additions.add("String");
        } else {
            System.out.println("Sorry you cannot add more than 4 items");
        }
    }

    public double finalPrice() {
        return this.basePrice + (this.additions.size() * this.additionPrice);
    }
}
