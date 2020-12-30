package com.papaya.aop_examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class QuoterConf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(QuoterConf.class);
        context.getBean(QuoterAggregator.class).printQuotes();
    }
}
