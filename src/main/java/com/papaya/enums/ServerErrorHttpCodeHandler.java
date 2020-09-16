package com.papaya.enums;

/**
 * @author Evgeny Borisov
 */
public class ServerErrorHttpCodeHandler implements HttpCodeHandler {
    @Override
    public void handle(int httpCode) {
        System.out.println("Server error was "+httpCode);
        System.out.println("server will be restarted");
    }
}
