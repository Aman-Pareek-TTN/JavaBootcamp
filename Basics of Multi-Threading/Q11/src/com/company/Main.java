package com.company;

public class Main {


    public static void main(String[] args) {

        long start=System.currentTimeMillis();

        Thread t1=new Thread(new MyThread1());
        Thread t2=new Thread(new MyThread2());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        long end=System.currentTimeMillis();

        System.out.println("Taken time: " + (end-start));

        System.out.println("count1 = " + Increament.getCount1());
        System.out.println("count2 = " + Increament.getCount2());


    }
}
