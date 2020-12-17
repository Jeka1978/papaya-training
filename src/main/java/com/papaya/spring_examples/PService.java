package com.papaya.spring_examples;/**
 * @author Evgeny Borisov
 */

import org.springframework.stereotype.Service;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Service
public @interface PService {
}
