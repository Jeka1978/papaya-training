package com.papaya.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
@Getter
public enum HttpCodeEnum {

    SUCCESS(100,200,new SuccessHttpCodeHandler()),
    REDIRECT(201,300, new RedirectionHttpCodeHandler()),
    CLIENT_ERROR(301,400, new ClientErrorHttpCodeHandler()),
    SERVER_ERROR(401,500, new ServerErrorHttpCodeHandler());

    private final int min;
    private final int max;
    private final HttpCodeHandler handler;



    public static HttpCodeEnum findByHttpCode(int code) {
        HttpCodeEnum[] httpCodeEnums = values();
        for (HttpCodeEnum httpCodeEnum : httpCodeEnums) {
            if (httpCodeEnum.min <= code && httpCodeEnum.max >= code) {
                return httpCodeEnum;
            }
        }
        throw new UnsupportedOperationException(code + " not supported");
    }


















}
