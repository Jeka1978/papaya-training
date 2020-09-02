package com.papaya.test_runners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Evgeny Borisov
 */
public class ObjectAnalyzer {
    public void printMetaData(Object o) throws Exception {
        Class<?> c = o.getClass();

        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println("method.getReturnType() = " + method.getReturnType());
        }
        Constructor<?>[] constructors = c.getConstructors();
        for (Constructor<?> constructor : constructors) {
            if (constructor.isAnnotationPresent(Deprecated.class)) {
                Object o1 = constructor.newInstance();
                System.out.println(o1);
            }
        }
    }
}


