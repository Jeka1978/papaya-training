package com.papaya.our_spring;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class JavaHardcodedConfig implements Config {


    private Map<Class<?>, Class<?>> ifc2ImplClass = Map.of(
            Speaker.class,ConsoleSpeaker.class,
            Cleaner.class,PowerCleaner.class
    );



    @Override
    public <T> Class<T> getImplClass(Class<T> type) {
        return (Class<T>) ifc2ImplClass.get(type);
    }
}
