package com.kyleanderson;

public class Challenge {

    /** when overriding the equals() method in the HeavenlyBody class, we
     * were careful to make sure that it would not return true if a HeavenlyBody
     * was compared to a subclass of itself.
     *
     * We did that to demonstrate that method, but it was actually
     * unnecessary in the HeavenlyBody class.
     *
     * The mini challenge is just a question: why was it unnecessary?
     *
     * Hint: if you are stuck, check out lecture 97
     *
     *Answer:
     *
     * The HeavenlyBody Class is declared final, so cannot be subclassed.
     * The Java String classs is also final, which is why it can safely
     * use the instanceOf method without having to worry about
     * comparisons with a subclass
     */
}
