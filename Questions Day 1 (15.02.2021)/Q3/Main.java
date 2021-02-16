package com.company;

public class Main {

    public static int countOcc(String str,char ch){

        return countOccurence(str,ch,0);
    }

    public static int countOccurence(String str, char ch ,int count)
    {
        if(str==null)
            return count;
        else if(str.length()==0)
            return count;
        else if(str.indexOf(ch)==-1)
            return count;
        else
            return countOccurence(str.substring(str.indexOf(ch)+1),ch,count+1);
    }
    public static void main(String[] args) {

        String str="Aman Pareek";
        char ch='a';

        System.out.println("Occurance of Character '"+ ch +"' is : "  + countOcc(str,'a'));

    }
}
