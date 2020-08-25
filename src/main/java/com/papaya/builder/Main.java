package com.papaya.builder;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

//
//        PolicyService policyService2 = PolicyService.builder().numberOfAccisents(12).build();
//        System.out.println(policyService2);


        PoliceServiceWithLombok service = PoliceServiceWithLombok.builder().driverAge(12).driverStage(12).numberOfAccisents(12)
                .beer("Tuborg", 2)
                .beer("Leff", 4)
                .דג("Carpion")
                .build();
        System.out.println("service = " + service);


    }
}
