package com.leiva.oca;

class MySuperArray {

    int size;

    public MySuperArray(int size) {
        this.size = size;
        System.out.println("[SUPER] superclass MySuperArray-> In constructor");
    }

    static {
        System.out.println("[SUPER] superclass MySuperArray-> In static block...!");
    }

    {
        System.out.println("[SUPER] superclass MySuperArray-> In instance block...!");
    }

}

public class MyArray extends MySuperArray {

    private static String code = "-";
    private int size = 0;

    static {
        System.out.println("[SUB] subclass MyArray-> In static block...!");
    }

    {
        System.out.println("[SUB] subclass MyArray-> In instance block...!");
    }

    public MyArray() {
        this(1);
        System.out.println("[SUB] subclass MyArray-> In constructor");
    }

    public MyArray(int size) {
        super(size);
    }

    public static void main(String[] args) {
//        String[] x = new String[8];
//        String[][] y = new String[5][];
//        String[][][][] z = new String[2][][][];
//        String[][][][] zz = new String[2][][][];
        for (int i = 0; i < 10; i++) {
            new MyArray();
        }

    }

}
