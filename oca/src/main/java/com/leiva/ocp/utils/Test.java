package com.leiva.ocp.utils;

import java.nio.file.Paths;

public class Test {

    public static void main(String[] args) {
        final FileUtils fu = new FileUtilsImpl();
        System.out.println(fu.pathExists(Paths.get("aadas")));
    }

}
