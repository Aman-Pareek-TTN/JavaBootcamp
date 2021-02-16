package com.company;

public class Bank {

    double rOI;
    String bName;
    String bBranch;

    public Bank(){

        rOI=0.0;
        bName="none";
        bBranch="none";

    }


    public String getDetails(){

        return " "+ rOI+bName+bBranch;
    }

}