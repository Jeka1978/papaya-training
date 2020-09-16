package com.papaya.java8_examples;

/**
 * @author Evgeny Borisov
 */
public class StringIgnoreCaseEqualor implements Equalator<String> {
    @Override
    public boolean equals(String s, String t1) {
        return s.equalsIgnoreCase(t1);
    }


}
