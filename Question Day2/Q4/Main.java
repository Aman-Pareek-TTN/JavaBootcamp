package com.company;

public class Main {

    public static void main(String[] args) {

        SingletonClass sc= SingletonClass.getInstance();
        System.out.println(sc.s);

        SingletonClass sc2=SingletonClass.getInstance();
        System.out.println(sc2.s);

        if(sc==sc2)
        {
            System.out.println("Singleton class instances");
        }
        else
        {
            System.out.println("Not a Singleton class instances");
        }


    }
}
