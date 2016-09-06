package com.leiva.oca.ch1;

public class VarArg {

    private final String key;

    public VarArg() {
        key = "";
        System.out.println("Yes, a constructor doesn´t have return type");
    }

    public String VarArg() {
        return "Hello my friend!";
    }

    public static void main(String[] args) {
        VarArg a = new VarArg();
        System.out.println("" + a);
    }

    public static void test(String... x) {
    }

    /// Var arg must be the last parameter
    public static void doIt(String y, String... x) {
    }

    /// You can only have only one var arg per method
    //public static void go(String... a, String... b) {
    //}
    public static void go(String... a) {
    }

}
