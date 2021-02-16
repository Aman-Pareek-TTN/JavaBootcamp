package com.company;


public class ICICI extends Bank {

    double rOI;
    String bName;
    String bBranch;

    public ICICI(){

        rOI=0.0;
        bName="ICICI";
        bBranch="none";

    }

    public ICICI(double r, String b){

        rOI=r;
        bBranch=b;
        bName="ICICI";

    }

    public String getDetails(){

        return bName+ "Bank's" +  bBranch + "'s " + "Rate of Interest is : "+ rOI;
    }

}