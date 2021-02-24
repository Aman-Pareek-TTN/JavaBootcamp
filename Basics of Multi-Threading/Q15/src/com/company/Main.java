package com.company;

public class Main {

    public static void main(String[] args) {

        PC pc=new PC();

        Thread t1=new Thread(new MyThread1(pc));
        Thread t2=new Thread(new MyThread2(pc));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
