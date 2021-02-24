package com.company;

public class MyConsumerThread2 implements Runnable{

    private PC pc;

    public MyConsumerThread2(){}

    public MyConsumerThread2(PC pc)
    {
        this.pc=pc;
    }

    @Override
    public void run() {

        try {
            pc.consumer2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
