package com.company;

public class Increament {

    private static int count1;
    private static int count2;

    public static  void  increamentCount1()
    {
        synchronized (new Object()){
            count1++;
        }
    }


    public static int getCount1()
    {
        return count1;
    }


    public static void  increamentCount2()
    {
        synchronized (new Object()){

        count2++;

        }

    }


    public static int getCount2()
    {
        return count2;
    }
}
