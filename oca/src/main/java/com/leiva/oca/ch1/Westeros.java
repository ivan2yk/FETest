package com.leiva.oca.ch1;

class Land {

    String getLord() throws Exception {
        return "-";
    }
}

public class Westeros extends Land {

    @Override
    String getLord() {
        return "Winterfell";
    }

    public static void main(String[] args) throws Exception {
        System.out.println("" + new Westeros().getLord());
    }

}
