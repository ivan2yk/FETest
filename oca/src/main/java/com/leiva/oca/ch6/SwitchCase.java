package com.leiva.oca.ch6;

public class SwitchCase {

    public static void main(String[] args) {
        String s = "bob";
        String[] sa = {"a", "bob"};
        final String s2 = "bob";
        StringBuilder sb = new StringBuilder("bob");

        switch (sa[1]) {
        }
        switch ("b" + "ob") {
        }
        switch (sb.toString()) {
            case "ann":
            //case s: will fail
            case s2:
        }

    }
}
