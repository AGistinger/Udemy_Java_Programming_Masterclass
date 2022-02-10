package academy.learnprogramming;

public class Camaro extends  Car {
    // Instance Variables
    private boolean heatedSeatsOn;
    private boolean headlightsOn;

    // Constructor
    public Camaro(boolean heatedSeatsOn, boolean headlightsOn) {
        super("coupe", "RWD");
        this.heatedSeatsOn = heatedSeatsOn;
        this.headlightsOn = headlightsOn;
    }

    // Getters and Setters
    public boolean getHeatedSeatsOn() {
        return this.heatedSeatsOn;
    }
    public boolean getHeadlightsOn() {
        return this.headlightsOn;
    }
    public void setHeatedSeatsOn(boolean heatedSeatsOn) {
        this.heatedSeatsOn = heatedSeatsOn;
    }
    public void setHeadlightsOn(boolean headlightsOn) {
        this.headlightsOn = headlightsOn;
    }

    // Functions
    @Override
    public boolean moving() {
        this.setSpeed(10);
        this.changeGears(1);
        System.out.println("Camaro is driving at " + this.getSpeed() + "mph and is in gear " + this.getGear());
        return true;
    }
}
