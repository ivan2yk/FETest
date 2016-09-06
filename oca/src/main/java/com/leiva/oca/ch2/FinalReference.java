package com.leiva.oca.ch2;

public class FinalReference {

    String name = "Initial name";
    int size;

    public static void main(String[] args) {
        final FinalReference fr = new FinalReference();
        changeName(fr);

        // You can change the object fields
        System.out.println("=============================");
        System.out.println("" + fr.name);
        System.out.println("" + fr.size);

        final FinalReference fr1 = new FinalReference();
        FinalReference fr2 = new FinalReference();
        // You cannot change the object fr1 refers to because it's final
        //fr1 = fr2;
    }

    static void changeName(FinalReference fr) {
        fr.name = "Changed name";
        fr.size = 1_0_0;
    }

}
