package com.papaya.never_use_switch;/**
 * @author Evgeny Borisov
 */

import org.springframework.stereotype.Service;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Service
public @interface PapayaService {
}
