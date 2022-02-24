package academy.learnprogramming;

public class PC {
    // Instance Variables
    private Case theCase;
    private Monitor monitors;
    private Motherboard motherboard;

    // Constructor
    public PC(Case theCase, Monitor monitors, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitors = monitors;
        this.motherboard = motherboard;
    }

    // Private Functions
    private void drawLogo() {
        // Fancy graphics
        monitors.drawPixelAt(1200, 50, "yellow");
    }

    // Public Functions
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }
}
