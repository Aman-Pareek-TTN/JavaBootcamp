package com.company;


import java.util.*;



public class Q3 {

    public static void printUniqueChars(String str){

        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(map.containsKey(ch))
            {
                int val=map.get(ch);
                val++;
                map.put(ch,val);
            }
            else
            {
                map.put(ch,1);
            }
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet())
            System.out.println("Character = " + entry.getKey() +
                    ", Occurrence = " + entry.getValue());
    }


    public static void main(String[] args)
    {

        String str="amanpareek";

        System.out.println("Occurrence of chars are:" );
        printUniqueChars(str);


    }
}
