package com.papaya.aop_examples;

import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class BenchmarkAspect {

    @SneakyThrows
    @Around("@annotation(Important)")
    public Object benchmarkImportantMethods(ProceedingJoinPoint pjp) {
        System.out.println("******* BENCHMARK STARTS FOR METHOD "+pjp.getSignature().getName()+" *******");
        long start = System.nanoTime();
        Object retVal = null;
        long end = System.nanoTime();
        System.out.println(end-start);
        System.out.println("******* BENCHMARK ENDED FOR METHOD "+pjp.getSignature().getName()+" *******");
        return retVal;
    }
}










