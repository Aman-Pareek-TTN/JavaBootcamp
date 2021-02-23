package com.company;

public class MyThread implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10000;i++) {
            new Increament().increamentWithSync();
            new Increament().increamentWithoutSync();
        }
    }
}
