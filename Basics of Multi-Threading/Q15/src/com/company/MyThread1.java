package com.company;

public class MyThread1 implements Runnable{

    PC pc;

    MyThread1(PC pc)
    {
        this.pc=pc;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++) {
            try {
                pc.producer();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
