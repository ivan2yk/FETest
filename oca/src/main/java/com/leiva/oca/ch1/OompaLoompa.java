package com.leiva.oca.ch1;

public class OompaLoompa {

    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("I good! ");
        sb.insert(2, "look ").append("and nice");
        sb.insert(sb.length(), "!!!");
        sb.delete(sb.length() - 2, sb.length());
        System.out.println("" + sb.toString().trim());

        StringBuilder x = new StringBuilder("Ivan");
        x.delete(1, 2);
        System.out.println("" + x);

        String wil = "Wilber";
        System.out.println(wil.substring(1, 3));

        String ivan = "Ivan ";
        ivan.concat(" loves Maria");
        ivan.toUpperCase();
        System.out.println("" + ivan);
    }
}
