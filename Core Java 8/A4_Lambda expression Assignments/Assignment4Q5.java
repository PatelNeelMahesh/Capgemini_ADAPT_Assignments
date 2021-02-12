package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q5 {

    List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) {
        Consumer<String> obj = name -> System.out.println(name);
        obj.accept(processWords(new Assignment4Q5().list));
    }

    public static String processWords(List<String> list)
    {
        StringBuilder s = new StringBuilder("");
        list.forEach(name->s.append(name.charAt(0)));
        return s.toString();
    }
}
