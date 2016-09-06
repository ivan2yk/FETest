package com.leiva.oca.ch2;

public class OscarSubClass extends FelixSuperClass {

    public long cat() {
        return 9L;
    }

    /**
     * - Overriden method can be less restrictive<br>
     * - Overriden method can throw any unchecked exception<br>
     * - Overriden method must not throw checked exception<br>
     * - You cannot overriden a method marked as STATIC<br>
     */
    @Override
    public Kitty getFeline(Feline x) throws RuntimeException {
        return null;
    }

    public static void staticMethod(String x) {
    }

//    long cat() {
//        return 6L;
//    }
}
