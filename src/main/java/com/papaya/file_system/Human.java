package com.papaya.file_system;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Human implements Serializable {

    public static final int MAX_AGE = 120;

    private String name;
    private transient int age;


    public void incAge(int... x) throws IllegalStateException {
        this.age++;
    }
}
