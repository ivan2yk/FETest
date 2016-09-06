package com.leiva.oca.ch1;

interface Breakable {

    public static long x = 1l;
    int y = 3;

    void breakSmoothly();

    byte doMore();

}

class Car {
}

class FancyCar extends Car {

    void doStuff() throws Exception {
    }

}

class SuperFancyCar extends FancyCar implements Breakable {

    @Override
    public void breakSmoothly() {
        System.out.println("=)");
    }

    public static void main(String[] args) {
    }

    @Override
    void doStuff() {
    }

    @Override
    public byte doMore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public class TestCarHierarchy {

    public static void main(String[] args) {
        print(new FancyCar());
    }

    private static void print(Car x) {
//        ((Breakable) x).breakSmoothly();
        ((SuperFancyCar) x).breakSmoothly();
    }
}
