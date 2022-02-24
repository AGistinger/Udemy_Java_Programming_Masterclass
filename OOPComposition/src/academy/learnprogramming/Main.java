package academy.learnprogramming;

public class Main {

    /*
      Compositon
      Composition in Java is used to compose objects of other objects such in the below example.
      This is used when inheritance is not valid as instead of an object being a child of a
      different object, the object is composed of various other objects.
     */

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

//        thePC.getMonitors().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();

        thePC.powerUp();

        /*
          Composition Challenge
            Create a single room of a house using composition.
            Think about the things that should be included in the room.
            Maybe physical parts of the house but furniture as well.
            Add at least one method to access an object via a getter and then
            add at least one method to hide the object, e.g. not using a getter
            but to access the object used in the composition within the main class
            like you for PC.
         */

        Outlets outlets = new Outlets(2, "American");
        Mattress mattress = new Mattress("Beautyrest", "Memory Foam", "Queen");
        Bed bed = new Bed("Wooden", mattress);
        Bedroom bedroom = new Bedroom(outlets, bed);

        System.out.println("Bed type is: " + bed.getBedFrameType());
        bedroom.getBed().getMattress().mattressDetails();
    }
}
