package com.leiva.oca.app;

public class Foxtrot extends Tango {

    String getType() {
        return "foxtrot";
    }

    /**
     * This is basis of polymorphism
     *
     * And it is supposed to work like that.
     *
     * Any method is dispatched (selected/invoked) dynamically according to the
     * actual type of the object instead of the type by which it is being
     * referred to.
     *
     * When you cast the object to another type, you just refer it using another
     * type. The actual type of the object is not changed. (And it can never
     * change).
     *
     * So the behavior that you are observing is as expected and it is designed
     * to be that way. It's definitely not a limitation.
     *
     * http://stackoverflow.com/questions/22874640/overriding-methods-in-java-and-then-casting-object-to-parent-class-behavior
     *
     * Hope this helps.
     */
    public static void main(String[] args) {
        Charlie c1 = new Foxtrot();
        Charlie c2 = new Tango();
        Charlie c3 = (Charlie) new Tango();

        System.out.println(c3 instanceof Foxtrot);

        System.out.println(c1.getType() + " " + c2.getType() + " " + c3.getType());
    }

}

class Charlie {

    String getType() {
        return "charlie";
    }
}

class Tango extends Charlie {

    String getType() {
        return "tango";
    }
}
