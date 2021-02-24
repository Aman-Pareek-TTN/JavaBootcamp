package com.company;

public class Main {

    public static void main(String[] args) {

        ScanClass sc = new ScanClass();

        Thread t1 = new Thread(new MyThread1(sc));
        Thread t2 = new Thread(new MyThread2(sc));

        t1.start();
        t2.start();

    }
}
