package com.leiva.oca.ch2;

public class FelixSuperClass {

    protected long cat() {
        return 7L;
    }

    Feline getFeline(Feline x) {
        return null;
    }

    /**
     * Can we Override static methods in java? We can declare static methods
     * with same signature in subclass, but it is not considered overriding as
     * there won’t be any run-time polymorphism. Hence the answer is ‘No’. If a
     * derived class defines a static method with same signature as a static
     * method in base class, the method in the derived class hides the method in
     * the base class.
     */
    static void staticMethod() {
    }

}
