package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newFixedThreadPool(2);

        try {
            for (int i = 0; i < 5; i++) {
                executorService.submit(new MyThread(i));
                if(executorService.isShutdown());
                {
                    System.out.println("Shutdown");
                }
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        executorService.shutdown();

        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(executorService.isTerminated())
        {
            System.out.println("All tasks done and terminated");
        }
    }
}
