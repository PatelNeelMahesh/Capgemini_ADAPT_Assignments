package com.company;

import java.util.*;

class Person{
    private String name;
    private int height;
    private double weight;

    public Person(String name, int height, double weight)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getN()
    {
        return name;
    }

    public int getH()
    {
        return height;
    }

    public double getW()
    {
        return weight;
    }
}

class Sorted implements Comparator<Person>
{
    public int compare(Person obj1, Person obj2){
        if(obj1.getW()==obj2.getW())
        {
            if(obj1.getH()>obj2.getH())
            {
                return 1;
            }
            else {
                return -1;
            }
        }
        else if(obj1.getW()>obj2.getW())
        {
            return 1;
        }
        return -1;
    }
}

public class Assignment3Q1 {
    public static void main(String[] args) {

        Person obj1 = new Person("One",150,60);
        Person obj2 = new Person("Two",170,80);
        Person obj3 = new Person("Three",160,50);
        Person obj4 = new Person("Four",140,70);

        TreeSet<Person> obj = new TreeSet<>(new Sorted());
        obj.add(obj1);
        obj.add(obj2);
        obj.add(obj3);
        obj.add(obj4);

        for(Person i : obj)
        {
            System.out.println("Name: " + i.getN()+ " Height: "+ i.getH()+ " Weight: "+i.getW());
        }


    }
}
