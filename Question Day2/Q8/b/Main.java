package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        String input=" ";

        do{
            System.out.println("Enter a keyword:");
            input=s.next();

            if(input.charAt(0)==input.charAt(input.length()-1))
            {
                System.out.println("First and last characters are same");
            }
            else
            {
                System.out.println("First and last characters are Different");

            }



        } while(!input.equalsIgnoreCase("done"));

    }
}
