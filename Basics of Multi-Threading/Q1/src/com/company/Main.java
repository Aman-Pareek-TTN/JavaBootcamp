package com.company;

public class Main {

    public static void main(String[] args) {

        MyThreadWithThreadClass thread1=new MyThreadWithThreadClass();

        Thread thread2=new Thread(new MyThreadWithRunnable());

        thread1.start();
        thread2.start();



    }
}
