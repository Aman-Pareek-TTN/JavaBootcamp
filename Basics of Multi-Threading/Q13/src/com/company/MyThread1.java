package com.company;

import java.util.Scanner;

public class MyThread1 implements Runnable{

        private ScanClass sc;

        public MyThread1(){
            sc=null;
        }

        public MyThread1(ScanClass sc)
        {
            this.sc=sc;
        }

    public void run() {

        sc.scanLine1();
    }


}
