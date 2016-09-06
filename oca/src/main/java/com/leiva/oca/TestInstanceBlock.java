package com.leiva.oca;

public class TestInstanceBlock {

    private static int size;
    private String name;

    public TestInstanceBlock(String name) {
        name = name;
    }

    public TestInstanceBlock() {
    }

    {
        System.out.println("In Instance block we can access to and static field -> " + size);
        System.out.println("In Instance block we can access to and instance field -> " + name);
    }

    public static void main(String[] args) {
        TestInstanceBlock tib = new TestInstanceBlock();
        System.out.println("" + size);
        System.out.println((3 + 2) * (10 + 10));

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("=====================================================");

        int x = 0;
        do {
            System.out.println(x);//012345
        } while (x++ < 5);
    }
}
