package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q8 implements Runnable{
    public static void main(String[] args) {

    Assignment4Q8 obj = new Assignment4Q8();
    Thread one = new Thread(obj);
    one.start();
    List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo");
    obj.out.accept(list);
    }

    Consumer<List<String>> out = list -> {for(String obj1:list){
        System.out.println(obj1);
    }};

    @Override
    public void run() {

    }
}
