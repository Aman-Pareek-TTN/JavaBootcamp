package com.company;

public class Main {

    public static void main(String[] args) {

        String str="Aman Pareek";
        System.out.println("String : " + str);


        StringBuffer strBuf=new StringBuffer(str);

        strBuf=strBuf.reverse();


        String chars4To9=strBuf.substring(4,9);

        System.out.println("Reversed String : " + strBuf);
        System.out.println("Characters from 4 to 9 : " + chars4To9);
    }
}
