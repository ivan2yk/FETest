package com.leiva.oca.ch2;

public class Green extends Color {

    public static void main(String[] args) {
        Color[] arr = new Color[]{new Green(), new Color(), new Blue(), new Red()};

        for (Color arr1 : arr) {
            
        }
    }
}

class Red extends Color {
}

class Blue extends Red {
}

class Color {
}
