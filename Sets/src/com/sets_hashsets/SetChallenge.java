package com.sets_hashsets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *Modify the previous HeavenlyBody example so that the HeavenlyBody
 * class also has a "bodyType" field.  This field will store the type
 * of HeavenlyBody (such as STAR, PLANET, MOON, etc).
 *
 * You can include as many types as you want, but must at least support
 * PLANET AND MOON.
 *
 * For each of the types that you support, subclass the HeavenlyBody class
 * so that your program can create objects of appropriate type.
 *
 * Although astronomers may shudder at this, our solar systems will allow two
 * bodies to have the same name as long as they are not the same type of body:
 * so you could have a start called "BetaMinor" and an asteroid also called "BetaMinor".
 *
 * There is a restriction that the only sattelites the planets can have
 * must be moons.  Even if you don't implement a STAR type, though, your program
 * should not prevent one being added in the future (and a START's sattelites can
 * be almost every type of HeavenlyBody).
 *
 * Test Cases:
 * 1. The plantes and moons that we added in the previous video should appear
 * in the solarSystem collection and in the sets of moons for the appropriate planets.
 *
 * 2. a.equals(b) must return the same result as b.equals(a) - equals is symmetric.
 *
 * 3. Attempting to add a duplicate to a Set must result in no change to the set(so
 * the original value is not replaced by the new one).
 *
 * 4. Attempting to add a duplicate to a Map results in the original being replaced
 * by the new object.
 *
 * 5. Two bodies with teh same name but different designations can be added to the
 * same set.
 *
 * 6. Two bodies with the same name but different designations can be added to the
 * same map, and can be retrieved from the map.
 */

public class SetChallenge {

    public static void main(String[] args) {

    }
}
