package com.papaya.our_spring;

/**
 * @author Evgeny Borisov
 */
public interface ProxyConfigurator {
    Object wrapWithProxyIfNeeded(Object t, Class<?> originalClass);
}
