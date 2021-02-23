package com.company;

public class MyThread2 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10000;i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Increament().increamentCount2();
        }
    }
}