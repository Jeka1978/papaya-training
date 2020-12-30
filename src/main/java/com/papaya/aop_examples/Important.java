package com.papaya.aop_examples;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Evgeny Borisov
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Important {
}
