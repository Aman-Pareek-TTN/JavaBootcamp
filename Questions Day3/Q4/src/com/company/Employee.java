package com.company;


import java.util.*;

class Employee {

    // instance member variables
    String name;
    Double age;
    Double sal;

    // parameterized constructor
    public Employee(String name, Double age, Double sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    public String toString()
    {
        return "Employee { name:" +name + " age: " + age + " salary: "+ sal + " }";
    }

    public Double getSalary(){
        return sal;
    }


    static class EmployeeCompare implements Comparator<Employee> {


        public int compare(Employee e1, Employee e2) {

            return (e1.getSalary().compareTo(e2.getSalary()));

        }
    }

    public static void main(String[] args) {

        List<Employee> al;
        al = new ArrayList<>();

        Employee obj1 = new Employee("Ajay", 27.0,26000.0);
        Employee obj2 = new Employee("Sneha", 23.0,24000.0);
        Employee obj3 = new Employee("Simran", 37.0,98000.0);
        Employee obj4 = new Employee("Ajay", 22.0,87666.0);
        Employee obj5 = new Employee("Ajay", 29.0,70000.0);
        Employee obj6 = new Employee("Sneha", 22.0,43000.0);

        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);


        Iterator<Employee> iterator = al.iterator();

        System.out.println("Before Sorting:\n");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Collections.sort(al, new EmployeeCompare());

        System.out.println("\n\nAfter Sorting:\n");
        for (Employee employee : al) {
            System.out.println(employee);
        }
    }
}




