package com.company;

import java.util.Scanner;

public class ScanClass {

    public void scanLine1(){

        synchronized (this)
        {
            Scanner scan=new Scanner(System.in);
                System.out.println("This is scanline method1 and it is waiting...");

                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Wait is over, enter a line...");
            System.out.println("Entered Line in scanline1 is :" + scan.nextLine());
        }
    }

    public void scanLine2(){

        Scanner scan = new Scanner(System.in);
        synchronized (this)
        {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("This is scanline2 method output and it is scanning and notifying");
            System.out.println("Entered Line in scanline2 is :" + scan.nextLine());
            System.out.println("Notifying now...");

            notifyAll();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
