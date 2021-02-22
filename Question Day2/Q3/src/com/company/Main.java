package com.company;

public class Main {

    public static void main(String[] args) {

        try
        {
            new ClassLoader(){}.loadClass("xyz");
        }
        catch (Exception ClassNotFound)
        {
            ClassNotFound.printStackTrace();
        }

        //if we delete the class from the com.company package
        // NoClassDefError would occur
        NoClassDefFoundClass obj1=new NoClassDefFoundClass();
        obj1.printHello();

    }
}
