package com.company;

public class Main {

    public static void countElements(String str)
    {
        int upper = 0, lower = 0, dig = 0, special = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                dig++;
            else
                special++;
        }

        System.out.println("Percentage of Digits:" + ((dig*100.0)/str.length()));
        System.out.println("Percentage of Lower Case Letters:" + ((lower*100.0)/str.length()));
        System.out.println("Percentage of Upper Case Letters:" + ((upper*100.0)/str.length()));
        System.out.println("Percentage of Special Characters:" + ((special*100.0)/str.length()));
    }

    public static void main(String[] args) {

        String str="31tdajkbbadshb913JADBJKBFA&%(^^&$";

        countElements(str);

    }
}
