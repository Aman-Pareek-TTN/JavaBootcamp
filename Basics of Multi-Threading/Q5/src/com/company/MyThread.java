package com.company;

public class MyThread implements Runnable{


    private int id;

    public MyThread(){}

    public MyThread(int id){
        this.id=id;
    }

    public void run() {

        System.out.println("Running... id:" + id);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Buzzz!!! Sleep Interrupted");
            e.printStackTrace();
        }
        System.out.println("Stopping... id:" + id);

    }
}
