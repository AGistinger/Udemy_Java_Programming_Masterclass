package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    /*
	    CHALLENGE:
	        Start with a base class of a Vehicle, then created a Car class that inherits from the
	        base class.
	        Finally, create another class, a specific type of car that inherits from the Car class.
	        You should be able to handle steering, changing gears, and moving (speed in other words).
	        You will want to decide where to put the appropriate state and behaviors.
	        As mentioned above, changing gears, increasing/decreasing speed should be included.
	        For the specific type of vehicle you will want to add something for that type of car.
	     */
        Camaro tempest = new Camaro(true, true);
        tempest.moving();
    }
}
