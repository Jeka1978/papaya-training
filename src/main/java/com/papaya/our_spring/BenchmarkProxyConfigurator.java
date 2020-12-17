package com.papaya.our_spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Evgeny Borisov
 */
public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    @Override
    public Object wrapWithProxyIfNeeded(Object t, Class<?> originalClass) {
        if (originalClass.isAnnotationPresent(Benchmark.class)/*or one of this methods needs benchmark*/) {
            Object proxy = Proxy.
                    newProxyInstance(originalClass.getClassLoader(), originalClass.getInterfaces(), new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            Method originalMethod = originalClass.getMethod(method.getName(), method.getParameterTypes());
                            if (originalMethod.isAnnotationPresent(Benchmark.class)/*or class has Benchamrk*/) {
                                System.out.println("*******BENCHMARK Started " + method.getName() + " *******(");
                                long start = System.nanoTime();
                                Object retVal = method.invoke(t, args);
                                long end = System.nanoTime();
                                System.out.println(end - start);
                                System.out.println("*******BENCHMARK ended" + method.getName() + " *******(");
                                return retVal;
                            }else {
                                return method.invoke(t, args);
                            }
                        }
                    });
            return proxy;
        } else {
            return t;
        }

    }
}
