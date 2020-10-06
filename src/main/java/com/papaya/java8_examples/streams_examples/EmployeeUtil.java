package com.papaya.java8_examples.streams_examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtil {

    public static void processEmployee(List<Employee> employees) {


        employees.stream()
                .filter(employee -> employee.getSalary() < 10)
                .peek(employee -> employee.setName(employee.getName().toUpperCase()))
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .map(Employee::getName)

                .forEach(System.out::println);
    }


    public long totalSalaries(List<Employee> employees) {
        return employees.stream()
                .mapToInt(Employee::getSalary).sum();
    }


    public static void main(String[] args) {



        List<Employee> employees = List.of(
                Employee.builder().name("Tal").salary(30).build(),
                Employee.builder().name("Jeka").salary(30).build(),
                Employee.builder().name("Borh").salary(6).build(),
                Employee.builder().name("James").salary(7).build()
        );

        processEmployee(employees);

        System.out.println(employees);
    }
}
