package com.company;

public class Main {

    public static void main(String[] args) {

        Runner runner=new Runner();

        Thread t1=new Thread(new MyThread1(runner));
        Thread t2=new Thread(new MyThread2(runner));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        runner.getTotal();

    }
}
