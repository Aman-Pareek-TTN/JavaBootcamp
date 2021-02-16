package com.company;

public class SBI extends Bank {

    double rOI;
    String bName;
    String bBranch;

    public SBI(){

        rOI=0.0;
        bName="SBI";
        bBranch="none";

    }

    public SBI(double r, String b){

        rOI=r;
        bBranch=b;
        bName="SBI";

    }
    public String getDetails(){

        return bName+ "Bank's" +  bBranch + "'s " + "Rate of Interest is : "+ rOI;
    }

}