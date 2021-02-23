package com.company;

import java.util.List;

public class MyThreadWithRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Run of Runnable Interface");
        for (int i : new int []{1,2,3,4,5,6,})
        {
            System.out.println(i);
        }
    }
}
