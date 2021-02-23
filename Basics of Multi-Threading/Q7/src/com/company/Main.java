package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newFixedThreadPool(2);

        System.out.println("Starting Tasks...");

        for(int i=0;i<5;i++)
            executorService.submit(new MyThread(i));

        executorService.shutdown();

        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All Tasks Done");


    }
}
