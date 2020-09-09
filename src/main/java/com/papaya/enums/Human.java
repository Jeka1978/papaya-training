package com.papaya.enums;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
public class Human {
    private String name;
    private MaritalStatus maritalStatus;


    public static void main(String[] args) {
        Human jack = new Human("Jack", MaritalStatus.SINGLE);
        Human bob = new Human("Bob", MaritalStatus.MARRIED);

        System.out.println(jack.getMaritalStatus()==bob.getMaritalStatus());

        bob.getMaritalStatus().getMaritalStatusHandler().handle();


        int dbCode = 1;

        System.out.println(MaritalStatus.findStatusByDbCode(dbCode).getUkraineDesc());


        System.out.println(MaritalStatus.SINGLE);

    }
}
