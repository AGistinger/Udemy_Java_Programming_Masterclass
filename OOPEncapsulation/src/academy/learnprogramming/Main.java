package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player1 = new EnhancedPlayer("Adrianne", 50, "Staff");
        System.out.println("Initial health is: " + player1.getHealth());

        /**
         * Challenge
         * Create a class and demonstrate proper encapsulation techniques
         * the class will be called Printer
         * It will simulate a real Computer Printer
         * It should have fields for toner level, number of pages printed, and
         * also whether its a duplex printer (capable of printin gon both sides of the paper).
         * Add methods to fill up the toner (to a mx of 100%), another method to
         * simulate printing a page (which should increase the number of pages printed).
         * Decide on the scope, whether to use constructors, and anything else you think is needed.
         */
        Printer printer = new Printer(true);
        printer.print(5);
        printer.print(10);
        printer.refillToner(50);
        printer.print(5);
        printer.print(10);
    }
}
