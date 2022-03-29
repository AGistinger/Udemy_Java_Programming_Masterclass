package academy.learnprogramming;

public class DeluxeBurger extends Burger {
    public DeluxeBurger(String breadRollType, String meat, double basePrice) {
        super(breadRollType, meat, basePrice, "Deluxe Burger");
        super.addAddition("Chips");
        super.addAddition("Drink");
    }

    @Override
    public void addAddition(String addition) {
        System.out.println("Additons are not allowed on the Deluxe Burger");
    }

    @Override
    public double finalPrice() {
        return this.getBasePrice();
    }
}
