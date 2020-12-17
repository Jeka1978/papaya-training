package com.papaya.our_spring;

import lombok.Getter;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import javax.annotation.PostConstruct;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {

    @Getter
    private static ObjectFactory instance = new ObjectFactory();
    private Config config = new JavaHardcodedConfig(); //todo not cahnge it
    private Reflections scanner = new Reflections("com.papaya.our_spring");
    private List<ObjectConfigurator> objectConfigurators = new ArrayList<>();
    private List<ProxyConfigurator> proxyConfigurators = new ArrayList<>();

    @SneakyThrows
    private ObjectFactory() {
        Set<Class<? extends ObjectConfigurator>> classes = scanner.getSubTypesOf(ObjectConfigurator.class);
        for (Class<? extends ObjectConfigurator> aClass : classes) {
            objectConfigurators.add(aClass.getDeclaredConstructor().newInstance());
        }
        Set<Class<? extends ProxyConfigurator>> classes2 = scanner.getSubTypesOf(ProxyConfigurator.class);
        for (Class<? extends ProxyConfigurator> aClass : classes2) {
            proxyConfigurators.add(aClass.getDeclaredConstructor().newInstance());
        }

    }


    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        Class<T> originalClass = resolveRealImpl(type);

        T t = create(originalClass);

        configure(t);

        invokeInit(type, t);
        // t is an object from original and it is already totally configured

        for (ProxyConfigurator proxyConfigurator : proxyConfigurators) {
            t = (T) proxyConfigurator.wrapWithProxyIfNeeded(t, originalClass);
        }

        return t;
    }








    private <T> void invokeInit(Class<T> type, T t) throws IllegalAccessException, InvocationTargetException {
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("init") || method.isAnnotationPresent(PostConstruct.class)) {
                method.invoke(t);
            }
        }
    }

    private <T> void configure(T t) {
        objectConfigurators.forEach(objectConfigurator -> objectConfigurator.configure(t));
    }

    private <T> T create(Class<T> implClass) throws InstantiationException, IllegalAccessException, java.lang.reflect.InvocationTargetException, NoSuchMethodException {
        return implClass.getDeclaredConstructor().newInstance();
    }

    private <T> Class<T> resolveRealImpl(Class<T> type) {
        Class<T> implClass = type;
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