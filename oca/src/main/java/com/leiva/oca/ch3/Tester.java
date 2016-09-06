package com.leiva.oca.ch3;

class Beta {
}

class Alpha {

    static Beta b1;
    Beta b2;
}

public class Tester {

    public static void main(String[] args) {
        Beta b1 = new Beta();
        Beta b2 = new Beta();
        Alpha a1 = new Alpha();
        Alpha a2 = new Alpha();

    }

}
