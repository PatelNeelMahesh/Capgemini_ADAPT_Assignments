package com.company;

import java.util.*;

class Manager extends Assignment2Q2
{
    @Override
    public int getSalary(int salary)
    {
        int incentive=5000;
        return salary+incentive;
    }
}
class Labour extends Assignment2Q2
{
    @Override
    public int getSalary(int salary)
    {
        int overtime=500;
        return salary+overtime;
    }
}
public class Assignment2Q2
{
    public static int salary=10000;
    public int getSalary(int salary)
    {
        return salary;
    }
    public static int totalEmployeesSalary(ArrayList<Integer> employeeSalaries)
    {
        return employeeSalaries.get(0)+employeeSalaries.get(1);
    }
    public static void main(String[] args)
    {
        Manager m =new Manager();
        Labour l =new Labour();

        ArrayList<Integer> employeeSalaries=new ArrayList<Integer>();

        employeeSalaries.add(m.getSalary(salary));
        employeeSalaries.add(l.getSalary(salary));

        System.out.println(totalEmployeesSalary(employeeSalaries));
    }
}