package com.leiva.ocp.utils;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestUtils {

    private static final ZipUtils zu = new ZipUtilsImpl();
    private static final FileUtils fu = new FileUtilsImpl();

    public static void main(String[] args) {                
        testUnZip();
        testDelete();
    }

    public static void testDelete() {
        try {
            Path file = Paths.get("C:\\Users\\Usuario\\Downloads\\target\\20511908745-01-F005-00002526.pdf");
            fu.delete(file);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public static void testUnZip() {
        try {
            Path zip = Paths.get("C:\\Users\\Usuario\\Downloads\\20511908745-01-F005-00002526.zip");
            Path target = Paths.get("C:\\Users\\Usuario\\Downloads\\target");
            zu.unzip(zip, target);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
