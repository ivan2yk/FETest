package com.leiva.oca.ch6;

public class Plane {

    static String a = "-";

    public static void main(String[] args) {
        new Plane().s1();
        System.out.println(""+a);
    }

    void s1() {
        try {s2();} catch (Exception e) {a+="c";}
    }

    void s2() throws Exception {
        s3();a += "2";
        s3();a += "2b";
    }

    void s3() throws Exception {
        throw new Exception();
    }

}
