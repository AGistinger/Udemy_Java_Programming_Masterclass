package com.sets_hashsets;

public class Labrador extends Dog {

    public Labrador(String name) {
        super(name);
    }

  // Don't override equals in sub classes
//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj) {
//            // is this object being compared against itself?
//            return true;
//        }
//
//        if(obj instanceof Labrador) {
//            // Casting object to a string
//            String objName = ((Labrador) obj).getName();
//            return this.getName().equals(objName);
//        }
//        return false;
//    }
}
