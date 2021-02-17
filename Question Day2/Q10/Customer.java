package com.company;

public class Customer {

    int tokenNum;
    int cusId;

    public void placeOrder(Cashier ch){

        int rs=100;
        tokenNum=ch.takeOrder(100);
    }

    public void getCoffee(){

        System.out.println("Coffee received");
    }


}
