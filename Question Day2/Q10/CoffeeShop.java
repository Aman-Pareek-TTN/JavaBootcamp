package com.company;

import java.util.ArrayList;

public class CoffeeShop {

    ArrayList<Integer> orderQ;
    ArrayList<Integer> orderCompletedQ;


    public ArrayList<Integer> getOrderQ(){
        return orderQ;
    }

    public ArrayList<Integer> getOrderCompletedQ(){

        return orderCompletedQ;

    }

    public CoffeeShop(){
        orderCompletedQ=new ArrayList<>();
        orderQ=new ArrayList<>();
    }

    public static void main(String[] args) {
    }
}
