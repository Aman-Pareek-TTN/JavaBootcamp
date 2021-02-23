package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newFixedThreadPool(2);

        try {
            for (int i = 0; i < 5; i++)
                executorService.submit(new MyThread(i));
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        //executorService.shutdown();


        //shutdownNow doesnt wait for the execution of all the threads
        // and try to stop the work as called
        try {
            executorService.shutdownNow();
        }
        catch (Exception exception){

           exception.printStackTrace();
        }


    }
}
