package com.papaya.our_spring;

/**
 * @author Evgeny Borisov
 */
//any implementation must have an empty constructor
public interface ObjectConfigurator {
    void configure(Object t);
}
