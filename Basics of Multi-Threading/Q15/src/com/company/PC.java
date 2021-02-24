package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PC {


    private List<Integer> list;
    private static int capacity=10;
    Lock lock=new ReentrantLock();
    Condition condition= lock.newCondition();

    public PC(){
        list=new ArrayList<Integer>();
    }

    public void producer() throws Exception{

        Random random =new Random();
        lock.lock();

        while(list.size()==capacity)
            condition.await();

        int temp=random.nextInt(100);
        System.out.println("Producer produced: " + temp);
        list.add(temp);

        condition.signal();
        lock.unlock();
        //condition.signalAll();

    }

    public void consumer() throws Exception{

        Thread.sleep(200);

        lock.lock();

        while (list.size()==0)
            condition.await();

        int temp=list.remove(0);
        System.out.println("Consumer consumed: " + temp);

        condition.signal();
        //condition.signalAll();

        lock.unlock();
    }





}

