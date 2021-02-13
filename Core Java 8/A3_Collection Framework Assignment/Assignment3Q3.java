package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class Assignment3Q3
{
    public static List traverseReverse(ArrayList a1)
    {
        List a2 = new ArrayList();

        ListIterator obj = a1.listIterator(a1.size());
        while (obj.hasPrevious())
        {
            a2.add(obj.previous());
        }
        return a2;
    }

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(1);
        a1.add(2);
        a1.add(3);

        System.out.println(traverseReverse(a1));
    }
}
