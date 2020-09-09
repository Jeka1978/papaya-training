package com.papaya.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
@Getter
public enum MaritalStatus {

    SINGLE(1, "Неодружений", new SingleMaritalStatusHandler()),
    MARRIED(3, "одружений", () -> System.out.println("Married was handled")),
    DIVORCED(7, "розлучений", () -> System.out.println("Divorced handled"));

    private final int dbCode;
    private final String ukraineDesc;
    private final MaritalStatusHandler maritalStatusHandler;


    public static MaritalStatus findStatusByDbCode(int dbCode) {
        MaritalStatus[] statuses = values();
        for (MaritalStatus status : statuses) {
            if (status.dbCode == dbCode) {
                return status;
            }
        }
        throw new UnsupportedOperationException(dbCode + " is not supported");
    }


}

