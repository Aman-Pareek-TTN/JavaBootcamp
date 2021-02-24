package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorFixedService= Executors.newFixedThreadPool(2);
        ExecutorService executorCachedService= Executors.newCachedThreadPool();

        System.out.println("Starting Tasks...");

        System.out.println("Fixed Service Execution");
        for(int i=0;i<5;i++) {

            executorFixedService.submit(new MyThread(i));
        }
        executorFixedService.shutdown();

        try {
            executorFixedService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cached Service Execution");
        for(int i=0;i<5;i++) {

            executorCachedService.submit(new MyThread(i));
        }
        executorCachedService.shutdown();

        try {
            executorCachedService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All Tasks Done");


    }
}
