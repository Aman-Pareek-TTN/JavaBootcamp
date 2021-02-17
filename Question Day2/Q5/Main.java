package com.company;

public class Main {

    public static void main(String[] args) throws Exception{

        CloneCopyClass obj1=new CloneCopyClass(17,18);
        obj1.display();

        CloneCopyClass obj2= (CloneCopyClass) obj1.clone();
        obj2.display();

        CloneCopyClass obj3=new CloneCopyClass(obj1);
        obj3.display();

    }
}
