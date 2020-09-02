package com.papaya.contstructors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Son extends Parent {

    private List<Object> objects = new ArrayList<>();

    public Son(String str) {



        super(str);



        objects.add("akjssjad");
        objects.add(232);
        String s ="123";
        int x = Integer.parseInt(s);
        double y = Double.parseDouble(s);

        String s1 = Integer.toBinaryString(x);


    }


    public static void main(String[] args) {

        Parent parent = new Son("sad");
    }
}
