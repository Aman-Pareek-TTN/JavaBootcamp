package com.company;

import java.util.Arrays;

public class Main {

    public static String sortString(String inputString)
    {
        Character tempArray[] = new Character[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            tempArray[i] = inputString.charAt(i);
        }

        Arrays.sort(tempArray);

        return new String(String.valueOf(tempArray));
    }


    public static void main(String[] args) {

        String inputString = "AmanPareek";
        String outputString = sortString(inputString);

        System.out.println("Input String : " + inputString);
        System.out.println("Output String : " + outputString);

    }
}
