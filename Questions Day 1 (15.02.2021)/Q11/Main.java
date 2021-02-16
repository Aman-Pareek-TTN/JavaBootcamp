package com.company;

import com.company.*;

public class Main
{
    public static void main(String args[])
    {
        Bank bank=new BOI(6.7, "Jhotwara");
        System.out.println(bank.getDetails());

        bank=new SBI(8.0,"Rajapark");
        System.out.println(bank.getDetails());

        bank=new ICICI(5.9,"Lal Kothi");
        System.out.println(bank.getDetails());

    }
}