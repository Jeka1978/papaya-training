package com.papaya.aop_examples;

import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class QuoterAspect {

    @Before("execution(* com.papaya..*.say*(..))")
    public void handleSayMethods(JoinPoint jp) {
        String simpleName = jp.getTarget().getClass().getSimpleName();
        System.out.println("This is qoute: "+simpleName);
    }

    @SneakyThrows
    public static void main(String[] args) {
        System.out.println(String.class.getMethod("toString"));
    }


}
