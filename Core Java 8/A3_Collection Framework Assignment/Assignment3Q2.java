package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment3Q2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> obj1 = new LinkedHashSet<>();
        obj1.add(5);
        obj1.add(8);
        obj1.add(7);

        HashSet<Integer> obj2 = new HashSet<>();
        obj2.add(5);
        obj2.add(8);
        obj2.add(7);

        if(obj1 == ordered(obj1))
        {
            System.out.println("ordered");
        }
        else {
            System.out.println("unordered");
        }

        if(obj2 == unordered(obj2))
        {
            System.out.println("unordered");
        }
        else
        {
            System.out.println("ordered");
        }

    }

    public static LinkedHashSet<?> ordered(LinkedHashSet linkedHashSet){
        return linkedHashSet;
    }
    public static HashSet<?> unordered(HashSet hashSet){
        return hashSet;
    }
}
