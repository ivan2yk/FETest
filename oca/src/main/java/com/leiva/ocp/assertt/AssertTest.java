package com.leiva.ocp.assertt;

public class AssertTest {

    public static void main(String... args) {
        String arg0 = null;
        System.out.println("This is an example of assertion, lets see: ");
        System.out.println("**********************************************************");

        doStuff(arg0);
    }

    private static void doStuff(String arg0) {
        System.out.println(String.format("arg0 -> %s", arg0));

        assert arg0 != null : "arg0 is null :(";
    }
}
