package com.papaya.builder;

import com.papaya.file_system.Human;
import lombok.Builder;
import lombok.NonNull;
import lombok.Singular;
import lombok.ToString;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Builder
@ToString
public class PoliceServiceWithLombok {
    private Integer driverAge;
    @NonNull
    private Integer driverStage;
    private Integer numberOfAccisents;
    private Integer numberOfAccisents2;


    @Singular
    public Map<String, Integer> beers;


    @Singular("דג")
    public List<String> fish;


}
