package com.leiva.oca.gc;

/**
 * Island of isolation of Garbage Collection<br>
 *
 * Object A references object B. Object B references object A. Neither object A
 * nor object B is referenced by any other object. That's an island of
 * isolation.
 *
 * Basically, an island of isolation is a group of objects that reference each
 * other but they are not referenced by any active object in the application.
 * Strictly speaking, even a single unreferenced object is an island of
 * isolation too.
 *
 */
public class Island {

    Island i;

    public static void main(String[] args) {
        Island i2 = new Island();
        Island i3 = new Island();
        Island i4 = new Island();

        i2.i = i3;
        i3.i = i4;
        i4.i = i2;

        System.out.println("i2 -> " + i2);
        System.out.println("i3 -> " + i3);
        System.out.println("i4 -> " + i4);
        System.out.println("i2 -> " + i2.i);
        System.out.println("i3 -> " + i3.i);
        System.out.println("i4 -> " + i4.i);

        i2 = null;
        i3 = null;
        i4 = null;

        System.out.println("i2 -> " + i2);
        System.out.println("i3 -> " + i3);
        System.out.println("i4 -> " + i4);
    }

}
