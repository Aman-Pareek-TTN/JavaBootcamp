package com.company;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        long timeNow = System.currentTimeMillis();

        System.out.println(timeNow);

        long seconds = TimeUnit.MILLISECONDS
                .toSeconds(timeNow);

        System.out.println(seconds);

        long minutes = TimeUnit.MILLISECONDS
                .toMinutes(seconds);

        System.out.println(minutes);

        long hours = TimeUnit.MILLISECONDS
                .toHours(seconds);

        System.out.println(hours);

        long days = TimeUnit.MILLISECONDS.toDays(seconds);
        System.out.println(days);






    }
}
