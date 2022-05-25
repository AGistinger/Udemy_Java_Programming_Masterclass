package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone; // define interface
        // DeskPhone timsPhone; // can also do this way, will not be able to reassign class
        timsPhone = new DeskPhone(123456); // class implementation of the interace
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(245666);
        timsPhone.powerOn();
        timsPhone.callPhone(245666);
        timsPhone.answer();
    }
}
