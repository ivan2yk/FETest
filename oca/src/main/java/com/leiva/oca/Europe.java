package com.leiva.oca;

public class Europe {

    public static void main(String[] args) {
        Country c1 = new Country();
        Country c2 = new Country();
        Country c3 = new Country();
        c1.rival = c3;
        c2.rival = c2;
        c3.rival = c1;
        c1 = null; // line 1
        c2 = null; // line 2
        c3 = null; // line 3
    }

}

class Country {

    Country rival;
}
