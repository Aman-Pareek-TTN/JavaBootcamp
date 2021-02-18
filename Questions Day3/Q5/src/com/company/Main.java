package com.company;

import java.util.*;

class Student {

    // instance member variables
    String name;
    Double age;
    Double score;

    // parameterized constructor
    public Student(String name, Double age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String toString()
    {
        return "Student { name:" +name + " age: " + age + " score: "+ score + " }";
    }

    public Double getScore(){
        return score;
    }

    public String getName(){ return name; }


    static class compareNames implements Comparator<Student> {


        public int compare(Student e1, Student e2) {

            return (e1.getName().compareTo(e2.getName()));

        }
    }

    static class compareScores implements Comparator<Student>{

        @Override
        public int compare(Student student, Student t1) {
            return (student.getScore().compareTo(t1.getScore()));
        }
    }



    public static void main(String[] args) {

        List<Student> al = new ArrayList<>();

        // create customer objects using constructor initialization
        Student obj1 = new Student("Ajay", 27.0,77.0);
        Student obj2 = new Student("Sneha", 23.0,99.9);
        Student obj3 = new Student("Simran", 37.0,77.0);
        Student obj4 = new Student("Ajay", 22.0,88.5);
        Student obj5 = new Student("Ajay", 29.0,98.8);
        Student obj6 = new Student("Sneha", 22.0,88.5);

        // add customer objects to ArrayList
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);

        Comparator score=new compareScores();
        Comparator scoreAndName= score.thenComparing(new compareNames());

        Iterator<Student> iterator = al.iterator();

        System.out.println("Before Sorting:\n");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Collections.sort(al, scoreAndName);

        System.out.println("\n\nAfter Sorting:\n");
        for (Student student : al) {
            System.out.println(student);
        }
    }
}

