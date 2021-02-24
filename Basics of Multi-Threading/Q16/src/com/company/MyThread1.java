package com.company;

public class MyThread1 implements Runnable {
    private Runner runner;

    public MyThread1(Runner runner)
    {
        this.runner=runner;
    }

    public void run() {
        try {
            runner.firstThread();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}