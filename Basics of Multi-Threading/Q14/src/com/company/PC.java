package com.company;

import java.util.LinkedList;

public class PC {

    // Create a list shared by producer and consumer
    // Size of list is 2.
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 10;

    // Function called by producer thread
    public void produce() throws InterruptedException
    {
        int value = 0;
        while (true) {
            synchronized (this)
            {


                System.out.print("Producer produced : { " + value );
                list.add(value++);
                System.out.print(", " +value);
                list.add(value++);
                System.out.println(", " +value + " }");
                list.add(value++);


                notifyAll();
                wait();

            }
        }
    }

    public void consumer1() throws InterruptedException
    {
        while (true) {
            synchronized (this)
            {
                int val = list.removeFirst();

                System.out.println("Consumer1 consumed-"
                        + val);

                notify();
                wait();

                Thread.sleep(1000);
            }
        }
    }

    public void consumer2() throws InterruptedException
    {
        while (true) {
            synchronized (this)
            {

                int val = list.removeFirst();

                System.out.println("Consumer2 consumed-"
                        + val);


                notify();
                wait();

                Thread.sleep(1000);
            }
        }
    }

    public void consumer3() throws InterruptedException
    {
        while (true) {
            synchronized (this)
            {

                int val = list.removeFirst();

                System.out.println("Consumer3 consumed-"
                        + val);


                notify();
                wait();

                Thread.sleep(1000);
            }
        }
    }
}
