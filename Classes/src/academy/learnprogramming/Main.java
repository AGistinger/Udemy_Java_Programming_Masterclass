package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Created Car object and initialized car
	    Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
