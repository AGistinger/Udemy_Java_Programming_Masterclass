package academy.learnprogramming;

public class Bed {
    private String bedFrameType;
    private Mattress mattress;

    public Bed(String bedFrameType, Mattress mattress) {
        this.bedFrameType = bedFrameType;
        this.mattress = mattress;
    }

    public String getBedFrameType() {
        return bedFrameType;
    }

    public Mattress getMattress() {
        return mattress;
    }
}
