package com.company;

public class MyConsumerThread1 implements Runnable{

    private PC pc;

    public MyConsumerThread1(){}

    public MyConsumerThread1(PC pc)
    {
        this.pc=pc;
    }

    @Override
    public void run() {

        try {
            pc.consumer1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
