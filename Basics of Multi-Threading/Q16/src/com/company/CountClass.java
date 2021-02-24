package com.company;

public class CountClass {
    private int count=10000;

    public static void transferCount(CountClass c1, CountClass c2, int factor)
    {
      int count1= c1.getCount();
      int count2= c2.getCount();
      count1-=factor;
      c1.setCount(count1);
      count2+=factor;
      c2.setCount(count2);

    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
