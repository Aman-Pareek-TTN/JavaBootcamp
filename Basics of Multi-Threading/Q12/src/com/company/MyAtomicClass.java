package com.company;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomicClass implements Runnable {

    private AtomicInteger count;

    public MyAtomicClass(AtomicInteger count) {
        this.count = count;
    }

    public void run() {

        for (int i=0;i<10000;i++)
            count.addAndGet(1);
    }

    public int getCount(){

        return count.get();

    }
}
