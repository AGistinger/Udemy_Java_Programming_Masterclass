package academy.learnprogramming;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int cylinders){
        this.engine = true;
        this. wheels = 4;
        this.cylinders = cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        if(this.engine) {
            System.out.println("The engine has been starated from base class Car");
        } else {
            System.out.println("There is no engine to start in base class car");
        }
    }

    public void accelerate() {
        System.out.println("Base class Car accelerated");
    }

    public void brake() {
        System.out.println("Base class Car began to brake");
    }
}

class Miata extends Car {
    private String name;

    public Miata() {
        super(4);
        this.name = "Miata";
    }

    public String getName() {
        return name;
    }

    @Override
    public void startEngine() {
        if(this.isEngine()) {
            System.out.println("The engine has been started from Miata");
        } else {
            System.out.println("There is no engine to start in Miata");
        }
    }
}

class Camaro extends Car {
    private String name = "Camaro";

    public Camaro() {
        super(8);
    }

    public String getName() {
        return name;
    }

    @Override
    public void startEngine() {
        if(this.isEngine()) {
            System.out.println("The engine has been started from Camaro");
        } else {
            System.out.println("There is no engine to start in Camaro");
        }
    }
}

class Z extends Car {
    private String name = "Z";

    public Z() {
        super(6);
    }

    public String getName() {
        return name;
    }

    @Override
    public void startEngine() {
        if(this.isEngine()) {
            System.out.println("The engine has been started from Z");
        } else {
            System.out.println("There is no engine to start in Z");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        /**
         * Polymorphism Challenge
         * We are going to go back to the car analogy.
         * Create a base calls called Car
         * it should have a few fields that would be apporpriate for a generic car class.
         * engin, cylinders, wheels, etc.
         * Constructor should initialize cylinders (number of) and name, and set the wheels
         * to 4 and engine to true.  Cylinders and names would be passed parameters.
         *
         * Create appropriate getters
         * Create some methods like startEngine, accelerate, and brake
         *
         * Show a message for each in the base class
         * Now create 3 sub classes for your favorite vehicles.
         * Override the appropriate methods to demonstrate polymorphism in use.
         * Put all classes in one java file.
         */
        Camaro camaro = new Camaro();
        camaro.startEngine();
        camaro.accelerate();
        camaro.brake();
        System.out.println(camaro.getCylinders());

        Miata miata = new Miata();
        miata.startEngine();
        miata.accelerate();
        miata.brake();
        System.out.println(miata.getCylinders());

        Z z = new Z();
        z.startEngine();
        z.accelerate();
        z.brake();
        System.out.println(z.getCylinders());
    }
}
