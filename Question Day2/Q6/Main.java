package com.company;

public class Main {

    public static void main(String[] args) {

        int x=1;
        int y=0;
        int z=0;
        try{
            System.out.println("In try, trying...");
            z=x/y;
            throw new Exception();

        }
        catch (ArithmeticException ae)
        {
            System.out.println("In Catch 1, Catching ArithmaticException...");
            ae.getMessage();
        }
        catch (Exception e){
            System.out.println("In Catch 2, Catching Exception...");
            e.getMessage();
        }
        finally {
            z=0;
            System.out.println("In Finally, Exiting...");
        }
    }
}
