package com.leiva.ocp.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PathsTest {

    /**
     * be careful when creating paths. The examples are absolute paths since
     * they begin with the root (/ on unix or c: on windows), when you don't
     * begin whit the root, the path is consideted relative path which means
     * java looks from the current directory
     */
    public static void main(String[] args) {
        Path p1 = Paths.get("/tmp/file1.txt"); // on Unix
        Path p2 = Paths.get("c:\\temp\\test"); // on Windows

        Path p1_ = Paths.get("/tmp", "file1.txt"); // same as p1
        Path p2_ = Paths.get("c:", "temp", "test"); // same as p2

        Path p3_ = Paths.get("temp", "test"); // relative path

        System.out.println("p1 -> " + p1_);
        System.out.println("p2 -> " + p2_);
        System.out.println("p3 -> " + p3_);

        FileSystem fs = FileSystems.getDefault();
        System.out.println("Default FileSytem -> " + fs);
        System.out.println("Default FileSytem Separator -> " + fs.getSeparator());

        File f = new File("");
        Path pp = f.toPath();

        testNIO();
        testNIOFilesAndDir();
    }

    private static void testNIO() {
        try {
            Path p = Paths.get("fileWrite1.txt");
            System.out.println(Files.exists(p));
            Files.createFile(p);
            System.out.println(Files.exists(p));
        } catch (IOException ex) {
            Logger.getLogger(PathsTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void testNIOFilesAndDir() {        
        try {
            Path p = Paths.get("D:\\TXT-TEST\\a\\b\\c");
            Path file = Paths.get("D:\\TXT-TEST\\a\\b\\c\\nio.txt");
            
            Files.createDirectories(p);
            Files.createFile(file);
        } catch (IOException ex) {
            Logger.getLogger(PathsTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
