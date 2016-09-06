package com.leiva.oca.ch3;

public class Wind {

    int id;

    Wind(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        new Wind(3).go();
        // 
        // when the commented line is reached  none of the three Wind objects can be accessed, 
        // so they are eligible for the gargabe collected
    }

    void go() {
        Wind w1 = new Wind(1);
        Wind w2 = new Wind(2);
        System.out.println(w1.id + " " + w2.id);
    }

}
