package com.leiva.oca.app;

public class GoldMine {

    int value = 1_00_0;
    boolean foundGold;

    /**
     * The while statement evaluates expression, which must return a boolean
     * value. If the expression evaluates to true, the while statement executes
     * the statement(s) in the while block. The while statement continues
     * testing the expression and executing its block until the expression
     * evaluates to false. Using the while statement to print the values from 1
     * through 10 can be accomplished as in the following WhileDemo program:
     *
     *
     */
    public static void main(String[] args) {
        GoldMine mine = new GoldMine();

        while (mine.foundGold = !mine.foundGold) {
            mine.value++;
            if (mine.value > 1_0_0_1) {
                mine.foundGold = true;
            }
        }
        System.out.println(mine.value);
    }

    private static void myStaticMethod() {
    }

    private static void myStaticMethod(String a) {
    }

    private static void myStaticMethod(String a, String b) {
    }

    private static String myStaticMethod(String a, String b, String c) {
        return a.concat(b);
    }
    
    private static GoldMine myStaticMethod(String a, String b, String x, int i) {
        return null;
    }

    private final void myFinalMethod() {
    }

    private void myFinalMethod(String x) {
    }

    String myFinalMethod(String x, String y) {
        return x.concat(y);
    }

}
