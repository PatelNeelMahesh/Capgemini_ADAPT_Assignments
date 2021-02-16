package com.company;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Assignment3Q8b {
    public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer> list){
        Iterator<Integer> obj = list.iterator();

        while(obj.hasNext())
        {
            System.out.println(obj.next());
            list.add(2021);
        }
        return list;
    }

    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> obj = new CopyOnWriteArrayList<Integer>();
        obj.add(21);
        obj.add(4);
        obj.add(2000);
        failFast(obj);
    }
}
