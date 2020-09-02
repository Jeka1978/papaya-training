package com.papaya.strings;

/**
 * @author Evgeny Borisov
 */
public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (String arg : args) {
            sb.append(arg).append(" ");
        }

        String s = sb.toString();
    }
}
