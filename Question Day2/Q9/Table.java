package com.company;

public class Table implements TestInterface{

    enum StressLevel {
        low, medium, high, veryhigh
    }

    int legs;
    String material;
    boolean isBurnable;
    String stressLevel;

    public Table() {

    }

    public Table(int legs, String material) {

        this.legs = legs;
        this.material = material;

        if (material.equalsIgnoreCase("wood")) {
            isBurnable = true;
            stressLevel = StressLevel.low.toString();
        } else {
            isBurnable = false;
            stressLevel = StressLevel.veryhigh.toString();
        }
    }

    public Object burn() {

        long startTime=System.currentTimeMillis();
        long end=System.currentTimeMillis();
        if (isBurnable) {
        end+=600000;
                System.out.println("Table Burning...");
                while(startTime++<end);

            System.out.println("Table Burnt");
            return null;
        } else {
            System.out.println("This is a metal  table and it does not burn");
            return this;
        }

    }

    public void showDetails() {

        System.out.println("Table is made of : " + material);
        System.out.println("It has " + legs + " legs");
        if (isBurnable) {
            System.out.println("It can burn");
            System.out.println("It has " + stressLevel + " stress level");
        } else {
            System.out.println("It cannot burn");
            System.out.println("It has " + stressLevel + " stress level");
        }
    }


    public Object stressTest() throws Exception {

        long startTime = System.currentTimeMillis();
        long end = startTime;
        if (stressLevel.equalsIgnoreCase("low")) {
            end = startTime + 3000;

            System.out.println("Table Breaking...");

            while(startTime++<end);

            System.out.println("Table Broken, It was wood Table so it did not take long");
            return null;
        } else {
            end = startTime + 6000;

            System.out.println("Table Breaking...");
            while (startTime++ < end);

            System.out.println("Table Broken, It was metal table so took quite long");
            return null;
        }

    }
}