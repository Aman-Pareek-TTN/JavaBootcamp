package com.company;

public class MyProducerThread implements Runnable{

    private PC pc;

    public MyProducerThread(){}

    public MyProducerThread(PC pc)
    {
        this.pc=pc;
    }


    @Override
    public void run() {

        try {
            pc.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
