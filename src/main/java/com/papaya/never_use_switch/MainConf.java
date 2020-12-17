package com.papaya.never_use_switch;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableScheduling
public class MainConf {



    @Bean
    public Faker faker(){
        return new Faker();
    }


    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(MainConf.class);
    }
}
















