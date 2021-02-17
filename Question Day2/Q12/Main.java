package com.company;

public class Main {

    public static void main(String[] args) {

        Child ch=new Child();


        //output:
        //static - grandparent
        //static - parent
        //static - child
        //instance - grandparent
        //constructor - grandparent
        //instance - parent
        //constructor - parent
        //instance - child
        //constructor - child

    }
}
