package com.leiva.oca.ch1;

public class SuitCase {

    private int id;

    public SuitCase(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        SuitCase s = (SuitCase) obj;
        return (id == s.id);
    }

    public static void main(String[] args) {
        SuitCase a = new SuitCase(1);
        SuitCase b = new SuitCase(1);

        if (a == b) {
            System.out.println("==");
        }
        if (a.equals(b)) {
            System.out.println("==");
        }
    }

}
