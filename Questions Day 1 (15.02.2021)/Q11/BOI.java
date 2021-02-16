package com.company;

public class BOI extends Bank {

    double rOI;
    String bName;
    String bBranch;

    public BOI(){

        rOI=0.0;
        bName="BOI";
        bBranch="none";

    }

    public BOI(double r, String b){

        rOI=r;
        bBranch=b;
        bName="BOI";

    }

    public String getDetails(){

        return bName+ "Bank's" +  bBranch + "'s " + "Rate of Interest is : "+ rOI;
    }

}