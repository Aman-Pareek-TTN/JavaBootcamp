package com.company;

public class Main {

    public static void main(String[] args) {

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



    }
}
