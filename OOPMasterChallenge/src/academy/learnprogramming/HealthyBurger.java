package academy.learnprogramming;

public class HealthyBurger extends Burger {
    public HealthyBurger(String meat, double basePrice) {
        super("Brown rye", meat, basePrice, "Healthy Burger");
    }

    @Override
    public void addAddition(String addition) {
        if(this.getAdditions().size() < 6) {
            this.getAdditions().add("String");
        } else {
            System.out.println("Sorry you cannot add more than 6 items");
        }
    }

    @Override
    public double finalPrice() {
        if(this.getAdditions().size() >= 2) {
            return this.getBasePrice() + ((this.getAdditions().size() - 2) * 1.50);
        }
        return this.getBasePrice();
    }
}
