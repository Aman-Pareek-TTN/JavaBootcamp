package com.company;

import java.util.ArrayList;

public class Cashier {

    private ArrayList<Integer> orderQ;

    public Cashier(CoffeeShop cs){
        orderQ=cs.getOrderQ();
    }

    public int takeOrder(int rs)
    {
        if(orderQ.isEmpty())
        {
            orderQ.add(0,100);
        }
        else
        {
            orderQ.add(orderQ.size(),orderQ.get(orderQ.size()-1)+1);
        }
        return orderQ.get(orderQ.size()-1);
    }

}
