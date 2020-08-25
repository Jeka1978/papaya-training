package com.papaya.builder;

import lombok.Data;
import lombok.ToString;

/**
 * @author Evgeny Borisov
 */

@ToString
public class PolicyService {

    private int driverAge;
    private int driverStage;
    private int numberOfAccisents;
    private int numberOfAccisents2;

    private PolicyService(int driverAge, int driverStage, int numberOfAccisents, int numberOfAccisents2) {
        this.driverAge = driverAge;
        this.driverStage = driverStage;
        this.numberOfAccisents = numberOfAccisents;
        this.numberOfAccisents2 = numberOfAccisents2;
    }


    public static Builder builder(){
        return new Builder();
    }

    public int calcInsurance() {
       return driverAge * numberOfAccisents * driverStage;
    }

    static class Builder{
        private int driverAge;
        private int driverStage;
        private int numberOfAccisents;
        private int numberOfAccisents2;


        public Builder driverAge(int driverAge) {
            this.driverAge = driverAge;
            return this;
        }

        public Builder driverStage(int driverStage) {
            this.driverStage = driverStage;
            return this;
        }

        public Builder numberOfAccisents(int numberOfAccisents) {
            this.numberOfAccisents = numberOfAccisents;
            return this;
        }

        public Builder numberOfAccisents2(int numberOfAccisents2) {
            this.numberOfAccisents2 = numberOfAccisents2;
            return this;
        }


        public PolicyService build(){
            validate();
            return new PolicyService(driverAge, driverStage, numberOfAccisents, numberOfAccisents2);
        }

        private void validate() {
            if (driverStage == 0) {
                throw new IllegalStateException("driver stage can't be 0");
            }
        }
    }




}
