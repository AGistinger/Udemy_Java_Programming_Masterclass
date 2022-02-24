package academy.learnprogramming;

public class Outlets {
    private int numOutlets;
    private String outletType;

    public Outlets(int numOutlets, String outletType) {
        this.numOutlets = numOutlets;
        this.outletType = outletType;
    }

    public int getNumOutlets() {
        return this.numOutlets;
    }

    public String getOutletType() {
        return this.outletType;
    }

    public void power(boolean hasPower) {
        if(hasPower) {
            System.out.println("Outlets have power");
        }
    }
}
