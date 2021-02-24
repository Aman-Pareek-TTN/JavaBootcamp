package com.company;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>{


    private int id;

    public MyCallable(){}

    public MyCallable(int id){
        this.id=id;
    }

    public Integer call() {

        Random random=new Random();
        int sleepTime= random.nextInt(1000);
        System.out.println("Running... id:" + id);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Stopping... id:" + id);

        return sleepTime;
    }
}
