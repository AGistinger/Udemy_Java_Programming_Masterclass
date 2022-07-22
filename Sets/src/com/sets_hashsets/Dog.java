package com.sets_hashsets;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Can no longer be overriden in subclasses
    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            // is this object being compared against itself?
            return true;
        }

        if(obj instanceof Dog) {
            // Casting object to a string
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);
        }
        return false;
    }
}
