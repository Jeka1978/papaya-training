package com.papaya.our_spring;

import com.papaya.heroes.RandomUtil;
import lombok.Getter;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.*;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {

    @Getter
    private static ObjectFactory instance = new ObjectFactory();
    private Config config = new JavaHardcodedConfig(); //todo not cahnge it
    private Reflections scanner = new Reflections("com.papaya.our_spring");
    private List<ObjectConfigurator> objectConfigurators = new ArrayList<>();

    @SneakyThrows
    private ObjectFactory() {
        Set<Class<? extends ObjectConfigurator>> classes = scanner.getSubTypesOf(ObjectConfigurator.class);
        for (Class<? extends ObjectConfigurator> aClass : classes) {
            objectConfigurators.add(aClass.getDeclaredConstructor().newInstance());
        }

    }


    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        Class<T> implClass = resolveRealImpl(type);


        T t = create(implClass);


        objectConfigurators.forEach(objectConfigurator -> objectConfigurator.configure(t));


        return t;
    }

    private <T> T create(Class<T> implClass) throws InstantiationException, IllegalAccessException, java.lang.reflect.InvocationTargetException, NoSuchMethodException {
        return implClass.getDeclaredConstructor().newInstance();
    }

    private <T> Class<T> resolveRealImpl(Class<T> type) {
        Class<T> implClass=type;
        if (type.isInterface()) {
            implClass = config.getImplClass(type);
            if (implClass == null) {
                Set<Class<? extends T>> classes = scanner.getSubTypesOf(type);
                if (classes.size() != 1) {
                    throw new IllegalStateException(type + " has 0 or more than one impl, please update your config");
                }
                implClass = (Class<T>) classes.iterator().next();
            }
        }
        return implClass;
    }
}















 /* Constructor<?>[] constructors = type.getDeclaredConstructors();
        Constructor<?> constructorToUse;
        if (constructors.length == 1) {
            constructorToUse = constructors[0];
        }else {
            Optional<Constructor<?>> optional = Arrays.stream(constructors).filter(constructor -> constructor.isAnnotationPresent(PrimaryConstructor.class)).findAny();
            constructorToUse = optional.orElseThrow(IllegalStateException::new);
        }

        Class<?>[] parameterTypes = constructorToUse.getParameterTypes();
        Object[] parameters = Arrays.stream(parameterTypes).map(parameterType -> ObjectFactory.getInstance().createObject(parameterType)).toArray();

        Object t = constructorToUse.newInstance(parameters);*/