package com.papaya.test_runners;

import com.papaya.Person;

/**
 * @author Evgeny Borisov
 */
public class Start {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        ObjectAnalyzer analyzer = new ObjectAnalyzer();
        analyzer.printMetaData(person);
    }
}
