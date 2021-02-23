package com.company;

public class Increament {

    private static int countSync;
    private static int countWithoutSync;

    public static synchronized  void  increamentWithSync(){

        countSync++;
    }

    public static  void  increamentWithoutSync(){

        countWithoutSync++;
    }

    public static int getCountSync()
    {
        return countSync;
    }

    public static int getCountWithoutSync(){

        return countWithoutSync;
    }
}
