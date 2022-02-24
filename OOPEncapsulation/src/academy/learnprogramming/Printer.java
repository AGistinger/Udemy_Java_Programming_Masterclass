package academy.learnprogramming;

public class Printer {
    private int pagesPrinted = 0;
    private boolean duplex;
    private int toner = 100;

    public Printer(boolean duplex) {
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int getToner() {
        return toner;
    }

    public void print(int pages) {
        if(this.toner > 0) {
            if(this.duplex) {
                this.pagesPrinted += (pages / 2) + (pages % 2);
            } else {
                this.pagesPrinted += pages;
            }
            this.toner -= pages;
            System.out.println("Current total of pages printed: " + this.pagesPrinted);
        } else {
            System.out.println("Please refill toner, unable to print");
        }
    }

    public void refillToner(int toner) {
        if(toner + this.toner <= 100) {
            this.toner += toner;
        } else {
            this.toner = 100;
        }
        System.out.println("Current toner level is: " + this.toner + "%");
    }
}
