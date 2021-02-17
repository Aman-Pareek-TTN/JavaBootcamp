package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=0;
        try{

            while(true)
            {
                System.out.println("Enter a digit");
                a=s.nextInt();

                if(a>=10)
                    throw new InvalidInputException("It is not a digit its a number");
            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();

        }
    }
}
