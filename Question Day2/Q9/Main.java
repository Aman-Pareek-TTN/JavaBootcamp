package com.company;

public class Main {

    public static void main(String[] args) {

        Chair ch1,ch2;

        try {

            ch1=new Chair(4,"wood");
            ch2=new Chair(3,"metal");

            ch1=(Chair) ch1.stressTest();
            ch2=(Chair) ch2.stressTest();

            //ch1.showDetails();
            //ch2.showDetails();

            ch1 = (Chair) ch1.burn();
            ch1.showDetails();

            ch2 = (Chair) ch2.burn();
            ch2.showDetails();


        }
        catch (Exception exp)
        {
            System.out.println("Chair has been brunt cannot be used further");
            exp.getMessage();
            exp.printStackTrace();
        }
        finally {

        }

        Table t1,t2;

        try {

            t1=new Table(4,"wood");
            t2=new Table(3,"metal");

            t1=(Table) t1.stressTest();
            t2=(Table) t2.stressTest();

            //ch1.showDetails();
            //ch2.showDetails();


            t1=(Table)t1.burn();
            t1.showDetails();

            t2 = (Table) t2.burn();
            t2.showDetails();


        }
        catch (Exception exp)
        {
            System.out.println("Table has been brunt cannot be used further");
            exp.getMessage();
            exp.printStackTrace();
        }
        finally {

        }

    }
}
