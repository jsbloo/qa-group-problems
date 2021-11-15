package myjavatestQA;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        String y = "";
        String z = "";

        ArrayList<String> words = new ArrayList<>() {{
            add("bib");
            add("no");
            add("ok");
            add("racecar");
            add("winner");
            add("chicken");
            add("robot1");
            add("ok");
            add("kebab");
            add("nun");
            add("madam");
            add("java");
            add("computer");
            add("civic");
            add("spitfire");
            add("coffee");
            add("hannah");
            add("deified");
            add("sword");
            add("pilgrim");
            add("level");
        }};


        for (String x : words) {
            for (int j = x.length() - 1; j >= 0; j--) {
                y = y + x.charAt(j);
                z = y;


            }
            y = "";
            System.out.println();

            System.out.println(x);
            System.out.println(z);
            if (x.equals(z)) {
                System.out.println("match");
                ArrayList<String> words2 = new ArrayList<>() {{
                    add(x);

                }};
            } else {
                System.out.println("No match");
            }
            System.out.println();
        }
    }


}
