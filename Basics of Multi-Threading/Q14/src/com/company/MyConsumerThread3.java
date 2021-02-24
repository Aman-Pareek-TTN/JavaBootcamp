package com.company;

public class MyConsumerThread3 implements Runnable{

    private PC pc;

    public MyConsumerThread3(){}

    public MyConsumerThread3(PC pc)
    {
        this.pc=pc;
    }

    @Override
    public void run() {

        try {
            pc.consumer3();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
