package com.company;

public class Main {


    public static void main(String[] args) {

/*
This is the implementation With Lambda Expression

        Thread t1=new Thread(()->{
            for(int i=0;i<10000;i++)
                increament();
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<10000;i++)
                increament();
        });
*/


        //with syncronize
        Thread t1=new Thread(new MyThread());
        Thread t2=new Thread(new MyThread());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Synchronous count = " + Increament.getCountSync());
        System.out.println("Asynchronous count : " + Increament.getCountWithoutSync());


    }
}
