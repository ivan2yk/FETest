package com.leiva.ocp;

import java.io.IOException;
import java.io.InputStream;

public class MyAutoCloseableImplementation implements AutoCloseable {

    private InputStream is;

    public MyAutoCloseableImplementation() {
        this(null);
    }

    public MyAutoCloseableImplementation(InputStream is) {
        this.is = is;
    }

    public void doStuff() {
        System.out.println("doing something...!");
    }

    @Override
    public void close() throws IOException {
        System.out.println("closing something...!");
        is.close();
    }

}
