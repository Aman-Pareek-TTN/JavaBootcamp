package com.company;

public class Main {


    public static int findOne(int arr[])
    {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++)
            res = res ^ arr[i];

        return res;
    }

    public static void main(String[] args) {

        int arr[]={1,9,9,8,7,6,7,6,8};

        System.out.println(findOne(arr));

    }
}
