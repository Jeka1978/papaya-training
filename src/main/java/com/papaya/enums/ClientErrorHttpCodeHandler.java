package com.papaya.enums;

/**
 * @author Evgeny Borisov
 */
public class ClientErrorHttpCodeHandler implements HttpCodeHandler {
    @Override
    public void handle(int httpCode) {
        System.out.println("we sent another mail, because client was unvailble");
    }
}
