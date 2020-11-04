package com.papaya.our_spring;

import com.papaya.heroes.RandomUtil;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomIntAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> implClass = t.getClass();
        Field[] fields = implClass.getDeclaredFields();
        for (Field field : fields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                int value = RandomUtil.getRandomBetween(min, max);
                field.setAccessible(true);
                field.set(t,value);
            }

        }
    }
}
