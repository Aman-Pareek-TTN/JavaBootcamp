package com.company;

public class Main {

    static String fName;
    static String lName;
    static int age;

    static
    {
        fName="Aman";
        lName="Pareek";
        age=23;

        System.out.println("From Static Block");

        System.out.println("FirstName: "+ fName);
        System.out.println("LastName: "+lName);
        System.out.println("Age: "+ age);
    }



    static void myDetails(){

        System.out.println("From Static Function");

        System.out.println("FirstName: "+ fName);
        System.out.println("LastName: "+lName);
        System.out.println("Age: "+ age);
    }

    public static void main(String[] args) {

        myDetails();

        System.out.println("From Main Function");
        System.out.println("FirstName: "+ fName);
        System.out.println("LastName: "+lName);
        System.out.println("Age: "+ age);



    }
}
