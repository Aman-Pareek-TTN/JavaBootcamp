package com.company;

public class Main {

    public static void printCommon(int[] arr1, int[] arr2)
    {
        for(int i=0;i<arr1.length;i++)
            for (int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
    }

    public static void main(String[] args) {
        int arr1[]={8,66,2,4,12,45};
        int arr2[]={77,66,21,433,1,4};

        printCommon(arr1,arr2);

    }
}
