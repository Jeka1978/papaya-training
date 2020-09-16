package com.papaya.enums;

/**
 * @author Evgeny Borisov
 */
public class StartMain {
    public static void main(String[] args) {

        HttpService httpService = new HttpService();
        httpService.handleByHttpCode(102);
        httpService.handleByHttpCode(202);
        httpService.handleByHttpCode(302);
        httpService.handleByHttpCode(402);
        httpService.handleByHttpCode(502);


    }
}
