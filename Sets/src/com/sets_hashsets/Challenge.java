package com.sets_hashsets;

/**
 * Challenge:
 * When ovveriding the equals() method in the HeavenlyBody class, we
 * were careful to make srue it would not return true of a HeavenlyBody
 * was compared to a subclass of itself.
 *
 * We did that to demonstrate that method, but it is actually
 * unnecessary in the HeavenlyBody class.
 *
 * The mini challenge is just a question: why was it unnessasary?
 *
 * Because it was final and cannot have a sub-class.
 *
 * Answer:
 * The HeavenlyBody class is declared final, so cannot be subclassed.
 * The Java String class is also final, which is why it can safely
 * use the instanceof method without having to worry about
 * comparisons with a subclass.
 */

public class Challenge {
}
