package com.leiva.ocp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyAutoCloseableClass implements AutoCloseable {

    private InputStream is;

    public MyAutoCloseableClass() {
        this(null);
    }

    public MyAutoCloseableClass(InputStream is) {
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
