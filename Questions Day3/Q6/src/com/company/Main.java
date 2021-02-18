package com.company;

import java.util.*;

public class Main {

    public static Map<Integer,Integer> sortMap(Map<Integer,Integer> map)
    {
        List<Map.Entry< Integer,Integer> > list=new ArrayList<Map.Entry<Integer,Integer> >(map.entrySet());

        Comparator cmp=new Comparator <Map.Entry<Integer,Integer>>() {
            @Override
            public int compare(Map.Entry<Integer,Integer> e1, Map.Entry<Integer,Integer> e2) {

                return e1.getValue().compareTo(e2.getValue());
            }
        };

        Collections.sort(list,cmp);

        Map<Integer, Integer> tempMap = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : list) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;

    }

    public static void main(String[] args) {

        int arr[]={1,7,8,6,5,9,1,7,8};

        Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int val=map.get(arr[i]);
                val++;
                map.put(arr[i],val);
            }
            else
            {
                map.put(arr[i],1);
            }
        }

        Iterator itr= map.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<Integer,Integer> ent = (Map.Entry<Integer, Integer>) itr.next();

            System.out.println("Key: " + ent.getKey() + ", Value: " + ent.getValue());
        }

        System.out.println();
        System.out.println();

        map=sortMap(map);

        itr= map.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<Integer,Integer> ent = (Map.Entry<Integer, Integer>) itr.next();

            System.out.println("Key: " + ent.getKey() + ", Value: " + ent.getValue());
        }

    }
}
