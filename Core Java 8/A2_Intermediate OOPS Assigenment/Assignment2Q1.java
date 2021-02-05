package com.company;
import java.util.*;

class SingletonInheritanceCheck
{
    private static SingletonInheritanceCheck si = null;
    public String c;
    private SingletonInheritanceCheck(){
        c = "SingletonInheritanceCheck";
    }

    public static SingletonInheritanceCheck getInstance()
    {
        if(si==null)
            si=new SingletonInheritanceCheck();
        return si;
    }
}

public class Assignment2Q1 {
    public static void main(String[] args) {

        SingletonInheritanceCheck obj = SingletonInheritanceCheck.getInstance();
        System.out.println(obj.c);
    }
}
