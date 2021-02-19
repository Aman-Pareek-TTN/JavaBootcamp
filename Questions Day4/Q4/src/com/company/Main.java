package com.company;

import java.util.List;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Supplier<Employee> employeeSupplier = ()->new Employee("emp101","Krish","JVM",25);

        Employee newEmployee=employeeSupplier.get();

        System.out.println("New Added Employee is:" + newEmployee);
    }
}
