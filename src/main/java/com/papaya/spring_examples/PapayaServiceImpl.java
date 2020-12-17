package com.papaya.spring_examples;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class PapayaServiceImpl implements PapayaService {

    @PostConstruct
    public void init() {
        System.out.println("papaya service was created");
    }


    @Override
    public void doWork() {
        System.out.println("Papaya is working...");
    }
}
