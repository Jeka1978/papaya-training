package com.papaya;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Evgeny Borisov
 */
@EqualsAndHashCode(exclude = "id")
@ToString(exclude = "age")
public class Person {
    private int id;
    private int age;
    private String name;


    @Deprecated
    public Person() {
        id=12;
        name = "Gena";
        age = 30;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalStateException("age can't be <0 ");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
