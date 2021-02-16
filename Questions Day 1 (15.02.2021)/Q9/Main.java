package com.company;

public class Main {

    enum House {flat(25000),bunglow(50000),villa(100000);

        private int val;

        private House (){
            val=0;
        }
        private House(int val){
            this.val=val;
        }

        public void getPrice(){

            System.out.println(this.toString()+ "'s Price : " + val);
        }
    };


    public static void main(String[] args) {

    House h=House.flat;
    h.getPrice();
    System.out.println();

    h=House.villa;
    h.getPrice();
    System.out.println();

    h=House.bunglow;
    h.getPrice();
    System.out.println();

    }
}
