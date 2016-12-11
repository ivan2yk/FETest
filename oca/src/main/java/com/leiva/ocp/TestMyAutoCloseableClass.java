package com.leiva.ocp;

public class TestMyAutoCloseableClass {

    private TestMyAutoCloseableClass() {
    }

    public static void main(String[] args) throws Exception {
        try (MyAutoCloseableImplementation macc = new MyAutoCloseableImplementation();) {
            macc.doStuff();
        }
    }

}
