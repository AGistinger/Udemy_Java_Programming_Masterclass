package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        /**
         * The purpose of the application is to help a ficticious company called Bill's Burgers to
         * manage their process of selling hamburgers.
         * Our application will help Bill to select types of burgers, some of the additional items to
         * be added to the burgers and pricing.
         * We want to create a base hamburger, but also two other types of hamburgers that are popular at
         * Bill's store.
         * The basic hamburger will have the following items.
         * Bread roll type, meat, and up to 4 additional additions (things like lettuce, tomato) that
         * the customer can select to be added to the burger.
         * Each of these items gets charged an additional price so you need a way to track how many
         * items got added and to calculate the final price (base burger with the additions).
         * Create a hamburger class to deal with all the above.
         * The constructor should only include the roll type, meat, and price, can also include the
         * name of burger or you can use a setter.
         * Also create two extra varieties of Hamburgers (subclasses) to cater for:
         * A) Healthy burger (on a brown rye bread rolle), plus two additonal items that can be added.
         * The healthy burger can have 6 additions in total.
         * Hint: You probably want to process the two additional items in this new class, since the two items
         * are only appropriate for this new class.
         * B) Delexe hamburger - comes with chips and drinks as additions, but no additons are allowed.
         * Hint: You have to find a way to automatically add these new additions at the time the deluxe
         * burger type is created and prevent any additions from being made.
         * All 3 classes should ahve a method that can be called anytime to show the base price of
         * the hamburger plus all additionals, each showing the addition name, and addition price, and a
         * grand/final total for the burger (base price + additinons).
         * For the two additional classes this may require you to be looking at the base class for pricing
         * and then adding the totals to the price.
         */
        Burger burger = new Burger("Brioche", "Angus", 5.99, "Burger");
        burger.addAddition("Tomato");
        burger.addAddition("Lettuce");
        burger.addAddition("Mushroom");
        System.out.println("Final Price of Burger is: " + burger.finalPrice());

        HealthyBurger healthyBurger = new HealthyBurger("Turkey", 6.99);
        System.out.println("Final Price of Health Burger is: " + healthyBurger.finalPrice());
        healthyBurger.addAddition("Lettuce");
        healthyBurger.addAddition("Tomato");
        System.out.println("Final Price of Healthy Burger is: " + healthyBurger.finalPrice());
        healthyBurger.addAddition("Mushroom");
        healthyBurger.addAddition("Avocado");
        System.out.println("Final Price of Healthy Burger is: " + healthyBurger.finalPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger("Sourdough", "Piedmonte", 8.99);
        System.out.println("Final Price of Deluxe Burger is: " + deluxeBurger.finalPrice());
        deluxeBurger.addAddition("Tomato");
        deluxeBurger.addAddition("Onion");
        System.out.println("Final Price of Deluxe Burger is: " + deluxeBurger.finalPrice());
    }
}
