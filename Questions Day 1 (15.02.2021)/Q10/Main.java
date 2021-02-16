package com.company;

public class Main {

    private int sum(int a, int b)
    {
        return a+b;
    }

    private double sum(double a, double b)
    {
        return a+b;
    }

    private int multiply(int a, int b)
    {
        return a*b;
    }

    private float multiply(float a, float b)
    {
        return (float)a*b;
    }

    private String conCate(String a, String b, String c)
    {
        return a+b+c;
    }

    private String conCate(String a, String b)
    {
        return a+b;
    }

    public static void main(String[] args) {

        Main obj1=new Main();

        System.out.println("Sum function:");
        System.out.println("sum of ints: " + obj1.sum(9,9));
        System.out.println("sum of floats: " + obj1.sum(9.0,9.0));

        System.out.println("Multiply function:");
        System.out.println("Multiplication of ints: " + obj1.multiply(9,9));
        System.out.println("Multiplication of floats: " + obj1.multiply(9.0f,9.0f));

        System.out.println("Concate function:");
        System.out.println("Two parameters cocate: " + obj1.conCate("Aman","Pareek"));
        System.out.println("Three parameters cocate: " + obj1.conCate("Mr.","Aman","Pareek"));

    }
}
