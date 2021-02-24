package com.company;

public class MyThread2 implements Runnable {
    private Runner runner;

    public MyThread2(Runner runner)
    {
        this.runner=runner;
    }

    public void run() {
        try {
            runner.secondThread();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}