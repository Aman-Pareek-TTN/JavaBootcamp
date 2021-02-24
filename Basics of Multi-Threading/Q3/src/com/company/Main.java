package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newSingleThreadExecutor();

        for(int i=0;i<5;i++)
            executorService.submit(new MyThread(i));

        executorService.shutdown();


    }
}
