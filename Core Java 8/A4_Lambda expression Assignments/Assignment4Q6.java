package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment4Q6 {

    public List<String> convertToUpperCase(List<String> list) {

        UnaryOperator<String> obj = s -> s.toUpperCase();
        list.replaceAll(obj);
        return list;
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

        Assignment4Q6 obj = new Assignment4Q6();
        System.out.println(obj.convertToUpperCase(list));
    }
}
