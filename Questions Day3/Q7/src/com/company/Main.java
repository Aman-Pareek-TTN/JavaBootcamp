package com.company;

public class Main {

    public static void main(String[] args) {

        MyStack s = new MyStack();
        s.push(8);
        s.push(7);
        s.push(1);
        s.push(9);
        s.push(8);
        s.getMin();
        s.pop();
        s.push(0);
        s.getMin();
        s.pop();
        s.getMin();

    }

}
