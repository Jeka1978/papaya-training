package com.papaya.aop_advanced_examples;

import com.papayastarterexample.demo.MariaDbException;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
public class PapayaDaoImpl implements PapayaDao {
    @Override
    public void saveSomeData() {
        System.out.println("start saving...");
        throw new MariaDbException("fire all DBA");
    }
}
