package com.papaya.aop_advanced_examples;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
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
public class Confi {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Confi.class);
        PapayaService papayaService = context.getBean(PapayaService.class);
        try {
            papayaService.work();
        } catch (Exception e) {
            System.out.println("some problem with DB, come back later");
        }
    }
}
