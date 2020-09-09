package com.papaya.enums;

/**
 * @author Evgeny Borisov
 */
public class SingleMaritalStatusHandler implements MaritalStatusHandler {
    @Override
    public void handle() {
        System.out.println("single was handled");
    }
}
