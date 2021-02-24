package com.company;

public class MyThread2 implements Runnable{

    PC pc;

    MyThread2(PC pc)
    {
        this.pc=pc;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++) {
            try {
                pc.consumer();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
