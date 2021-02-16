package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map countDuplicates(String str)
    {
        String wordArr[]=str.split(" ");

        Map<String,Integer> map=new HashMap<>();

        for(String word : wordArr)
        {
            if(map.containsKey(word))
            {
                int currCount=map.get(word);
                map.put(word,++currCount);
            }
            else
            {
                map.put(word,1);
            }
        }

        return map;
    }

    public static void main(String[] args) {


        String str="His name is Aman Aman is good guy";

        Map<String,Integer> map=countDuplicates(str);

        for (Map.Entry<String,Integer> entry : map.entrySet())
            System.out.println("word = " + entry.getKey() +
                    ", count = " + entry.getValue());

    }
}