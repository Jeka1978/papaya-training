package com.papaya.java8_examples.streams_examples.collectors_example;

import com.papaya.java8_examples.streams_examples.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Stream<Employee> stream = Stream.of(
                Employee.builder().name("John").salary(10).build(),
                Employee.builder().name("Jack").salary(15).build(),
                Employee.builder().name("James").salary(20).build(),
                Employee.builder().name("James").salary(25).build(),
                Employee.builder().name("Alex").salary(10).build()
        );


        Map<String, Long> map = stream.collect(groupingBy(Employee::getName, Collectors.counting()));
        System.out.println("map = " + map);

        /*  Map<String, List<Employee>> multiMap = stream.collect(Collectors.groupingBy(Employee::getName));
        System.out.println("multiMap = " + multiMap);*/




      /*  Map<String, Integer> map = stream.collect(Collectors.toMap(
                Employee::getName,
                Employee::getSalary,
                Integer::sum));
        System.out.println("map = " + map);*/
    }
}
