package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger();

        MyAtomicClass myAtomicClass=new MyAtomicClass(atomicInteger);

        Thread t1 = new Thread(myAtomicClass);
        Thread t2 = new Thread(myAtomicClass);


        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

      System.out.println("Total count:" + myAtomicClass.getCount());
    }
}
