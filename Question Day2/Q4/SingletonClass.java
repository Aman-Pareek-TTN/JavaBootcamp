package com.company;

class SingletonClass
{

    private static SingletonClass instance = null;

    public String s;

    private SingletonClass()
    {
        s = "Hello I am the first and last object of this class";
    }


    public static SingletonClass getInstance()
    {
        if (instance == null)
            instance = new SingletonClass();

        return instance;
    }

}
