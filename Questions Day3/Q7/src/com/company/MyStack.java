package com.company;


import java.util.Stack;

class MyStack
{
    Stack<Integer> s;
    Integer minEle;

    MyStack() { s = new Stack<Integer>(); }

    public void getMin()
    {
        if (s.isEmpty())
            System.out.println("Stack is empty");

        else
            System.out.println("Minimum Element is : " + minEle);
    }

    public void peek()
    {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty ");
            return;
        }

        int topEle = s.peek();

        System.out.print("Top Most Element is: ");


        if (topEle < minEle)
            System.out.println(minEle);
        else
            System.out.println(topEle);
    }


    public void pop()
    {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Element Removed: ");
        int topEle = s.pop();

        if (topEle < minEle)
        {
            System.out.println(minEle);
            minEle = 2*minEle - topEle;
        }

        else
            System.out.println(topEle);
    }


    public void push(int ele)
    {
        if (s.isEmpty())
        {
            minEle = ele;
            s.push(ele);
            System.out.println("Number " + ele + " inserted in Stack");
            return;
        }


        if (ele < minEle)
        {
            s.push(2*ele - minEle);
            minEle = ele;
        }

        else
            s.push(ele);

        System.out.println("Number " + ele + " inserted in Stack");
    }
}