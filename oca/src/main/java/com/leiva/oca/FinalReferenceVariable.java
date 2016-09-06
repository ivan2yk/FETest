package com.leiva.oca;

public class FinalReferenceVariable {

    public static void main(String[] args) {
        final MyClass mc1 = new MyClass("a");
        final MyClass mc2 = new MyClass("b");
        final Integer a = new Integer(1);

        switch (5) {
            case 4: {
            }
//          fail, because a constant expression is required
//          case a: {
//          }
        }

        mc1.modifyKey("---");
        mc2.modifyKey("..............");
        System.out.println("-> " + mc1.getKey());
        System.out.println("-> " + mc2.getKey());
    }

}

class MyClass {

    private String key;

    public MyClass(String key) {
        this.key = key;
    }

    public void modifyKey(String newKey) {
        this.key += newKey;
    }

    public String getKey() {
        return key;
    }
}
