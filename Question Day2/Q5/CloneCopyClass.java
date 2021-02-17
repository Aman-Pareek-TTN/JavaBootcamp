package com.company;

public class CloneCopyClass implements Cloneable{

    int a;
    int b;


    public CloneCopyClass(){
        a=0;
        b=0;
    }

    public CloneCopyClass(int x, int y){
        a=x;
        b=y;
    }

    public CloneCopyClass(CloneCopyClass obj){
        a= obj.a;
        b=obj.b;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this;
    }

    public void display()
    {
        System.out.println("a=" + a + " b=" + b);
    }

}
