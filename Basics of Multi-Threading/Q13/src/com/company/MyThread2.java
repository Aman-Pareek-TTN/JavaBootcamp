package com.company;

import java.util.Scanner;

public class MyThread2 implements Runnable{


    private ScanClass sc;

    public MyThread2(){
        sc=null;
    }

    public MyThread2(ScanClass sc)
    {
        this.sc=sc;
    }

    public void run() {

        sc.scanLine2();
    }

}
