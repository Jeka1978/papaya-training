package com.papaya.enums;

/**
 * @author Evgeny Borisov
 */
public class SuccessHttpCodeHandler implements HttpCodeHandler {
    @Override
    public void handle(int httpCode) {
        System.out.println("GREAT!!!");
    }
}
