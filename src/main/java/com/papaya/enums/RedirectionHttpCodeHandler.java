package com.papaya.enums;

/**
 * @author Evgeny Borisov
 */
public class RedirectionHttpCodeHandler implements HttpCodeHandler {
    @Override
    public void handle(int httpCode) {
        System.out.println("redirected!!!");
    }
}
