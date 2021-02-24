package com.company;

public class Main {

    public static void main(String[] args) {

        PC pc=new PC();


        Thread producer=new Thread(new MyProducerThread(pc));
        Thread consumer1=new Thread(new MyConsumerThread1(pc));
        Thread consumer2=new Thread(new MyConsumerThread2(pc));
        Thread consumer3=new Thread(new MyConsumerThread3(pc));

        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();

    }
}
