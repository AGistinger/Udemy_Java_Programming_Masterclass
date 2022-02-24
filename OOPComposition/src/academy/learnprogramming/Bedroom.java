package academy.learnprogramming;

public class Bedroom {
    private Outlets outlets;
    private Bed bed;

    public Bedroom(Outlets outlets, Bed bed) {
        this.outlets = outlets;
        this.bed = bed;
    }

    public Outlets getOutlets() {
        return outlets;
    }

    public Bed getBed() {
        return bed;
    }
}
