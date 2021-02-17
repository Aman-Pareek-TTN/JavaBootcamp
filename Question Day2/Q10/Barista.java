package com.company;

import java.util.ArrayList;

public class Barista {

    ArrayList<Integer> orderQ;
    ArrayList<Integer> orderCompletedQ;

    public Barista(CoffeeShop cs){
        orderCompletedQ= cs.getOrderCompletedQ();
        orderQ= cs.getOrderQ();
    }

    public void prepareCoffee(){

        int tokenNum= orderQ.get(0);
        orderQ.remove(0);
        System.out.println("Coffee prepared");
        orderCompletedQ.add(orderCompletedQ.size()-1,tokenNum);

    }

    public void serveCoffee(Customer cus){

        cus.getCoffee();
    }
}
