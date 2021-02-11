package com.company;
import java.text.DecimalFormat;
import java.util.*;

@FunctionalInterface
interface first{
    public double arithmetic(int num1,int num2);
}

public class Assignment4Q1 {

    private static DecimalFormat df = new DecimalFormat("0.0");

    public double addition(int num1,int num2)
    {
        first obj = (a,b) -> {return a+b;};
        return obj.arithmetic(num1,num2);
    }
    public double subtraction(int num1,int num2)
    {
        first obj = (a,b) -> {return a-b;};
        return obj.arithmetic(num1,num2);
    }
    public double multiplication(int num1,int num2)
    {
        first obj = (a,b) -> {return (a*b);};
        return obj.arithmetic(num1,num2);
    }
    public double division(int num1,int num2)
    {
        first obj = (a,b) -> {return Double.parseDouble(df.format((float)a/b));};
        return obj.arithmetic(num1,num2);
    }
    public static void main(String[] args) {
    }
}
