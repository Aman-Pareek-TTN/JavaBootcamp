package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) throws Exception{

        ExecutorService executorService= Executors.newFixedThreadPool(2);

        for (int i=0;i<10;i++)
        {
            Future<Integer> future = executorService.submit(new MyCallable(i));

            boolean stat=future.isDone();
            String status;
            if(stat) {
                System.out.println("future status: not done still running" );
                System.out.println("and with value: " + future.get());
            }
            else {
                System.out.println("future status: done");
            }

            boolean cancalled = future.isCancelled();

            if(cancalled)
            {
                System.out.println("Cancelled");

            }
            else {
                System.out.println("Not yet Cancelled still running");
                System.out.println("and with value: " + future.get());

            }
        }





    }
}
