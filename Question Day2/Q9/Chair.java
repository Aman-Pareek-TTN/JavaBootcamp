package com.company;

public class Chair implements TestInterface{

    enum StressLevel {
        low, medium, high, veryhigh
    }

    int legs;
    String material;
    boolean isBurnable;
    String stressLevel;

    public Chair() {

    }

    public Chair(int legs, String material) {

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

        long startTime = System.currentTimeMillis();
        long end = startTime;
        if (isBurnable) {
            end+=300000;
            System.out.println("Chair Burning...");

            while (startTime++ < end);

            System.out.println("Chair Burnt");
            return null;
        } else {
            System.out.println("This is a metal Chair and it does not burn");
            return this;
        }

    }

    public void showDetails() {

        System.out.println("Chair is made of : " + material);
        System.out.println("It has " + legs + " legs");
        if (isBurnable) {
            System.out.println("It can burn");
            System.out.println("It has " + stressLevel + " stress level");
        } else {
            System.out.println("It cannot burn");
            System.out.println("It has " + stressLevel + " stress level");
        }
    }


    public Object stressTest() {

        long startTime = System.currentTimeMillis();
        long end = startTime;
        if (stressLevel.equalsIgnoreCase("low")) {
            end = startTime + 300000;
            System.out.println("Chair Breaking...");

            while (startTime++ < end);

            System.out.println("Chair Broken, It was wood Chair so it did not take long");

            return null;
        } else {
            end = startTime + 600000;
            System.out.println("Chair Breaking...");

            while (startTime++ < end);

            System.out.println("Chair Broken, It was metal Chair so took quite long");
            return null;

        }

    }
}