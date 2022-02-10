package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(1, 1, 5, 5, "Animal");
        Dog dog = new Dog(8, 20, "Yorkie", 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

        /*
          CLASS:
          A class is a blueprint for a house, using the blueprint we can build as many houses as we like
          based on the plans.

          OBJECT/INSTANCE:
          Each house you build using the new operator is an object also known as an instance.

          REFERENCE:
          Each house you build has an address (a physical location).  In other words if you wanted to tell
          someone where you live, you give them your address.  This is a reference.

          You can copy that reference as many times as you like, but there is still just one house.
          In other words we are copying the paper that has the address on it and not the house itself.

          SUPER:
          Used to access/call the parent class members (variables and methods).

          THIS:
          Used to call the current class members (variables and methods).  This is required when we
          have a parameter with the same name as an instance variable.

          STATIC METHOD:
          Declared using the static modifier.
          Static methods can't access instance methods and instance variables directly.
          They are usually used for operations that don't requier any data from an instance of the class.
          In static methods you can't use the this keyword.

          INSTANCE METHOD:
          Instance methods belong to an instance of a class.
          To use an instance method we have to instantiate the class first usually by using the new keyword.
          Instance methods can access instance methods and instance variables directly.
          Instance methods can also acces static methods and static variables directly.

          STATIC VARIABLES:
          Declared by using the keyword static.
          Static variables are also known as static member variables.
          Every instance of that class shares the same static variable.
          If changes are made to that variable, all other instances will see the effect of the change.

          INSTANCE VARIABLES:
          They don't use the static keyword.
          Instance variables are also known as fields or member variables.
          Instance variables belong to an instance of a class.
          Every instance has it's own copy of an instance variable.
          Instance variables represent the state of an instance.
         */
    }
}
