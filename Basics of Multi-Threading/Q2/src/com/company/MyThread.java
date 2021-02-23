package com.company;

public class MyThread implements Runnable {

    private String threadName;
    private static int count;

    public MyThread(){
        count++;
        threadName="T"+count;
    }

    @Override
    public void run() {

        for(int i=0;i<100;i++) {
            System.out.println(threadName+ " count: " + i);
            if (i == 50) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
