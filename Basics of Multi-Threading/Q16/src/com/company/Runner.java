package com.company;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

    private  CountClass count1=new CountClass();
    private  CountClass count2=new CountClass();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void acquireLocks(Lock firstLock, Lock secondLock) throws InterruptedException {
        while(true) {

            boolean gotFirstLock = false;
            boolean gotSecondLock = false;

            try {
                gotFirstLock = firstLock.tryLock();
                gotSecondLock = secondLock.tryLock();
            }
            finally {
                if(gotFirstLock && gotSecondLock) {
                    return;
                }

                if(gotFirstLock) {
                    firstLock.unlock();
                }

                if(gotSecondLock) {
                    secondLock.unlock();
                }
            }

            // Waits for the lock to open
            Thread.sleep(1);
        }
    }

    public void firstThread() throws InterruptedException {

        Random random = new Random();

        for (int i = 0; i < 10000; i++) {

            //Clean Scenario
             acquireLocks(lock1, lock2);

            //deadlock Scenario
           // lock2.lock();
            // lock1.lock();

            try {
                int factor=random.nextInt(100);
                CountClass.transferCount(count1,count2,factor);

            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void secondThread() throws InterruptedException {
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {

            //Clean Scenario
             acquireLocks(lock2, lock1);

            //deadlock Scenario
            //lock1.lock();
            //lock2.lock();

            try {
                int factor=random.nextInt(100);
                CountClass.transferCount(count2,count1,factor);
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void getTotal() {
        System.out.println("Count1: " + count1.getCount());
        System.out.println("Count2: " + count2.getCount());
        System.out.println("Total Count: "
                + (count1.getCount() + count2.getCount()));
    }
}