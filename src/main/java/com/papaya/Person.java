package com.papaya;

/**
 * @author Evgeny Borisov
 */
public class Person {
    private int age;
    private String name;

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
