package com.papaya.enums;

/**
 * @author Evgeny Borisov
 */
public class HttpService {
    public void handleByHttpCode(int httpCode) {

        HttpCodeEnum httpCodeEnum = HttpCodeEnum.findByHttpCode(httpCode);
        httpCodeEnum.getHandler().handle(httpCode);


    }
}
