package com.company;

import java.util.HashMap;
import java.util.Map;

public class Assignment4Q7 {

    public String convertKeyValueToString(HashMap<String, Integer> map) {
        StringBuilder S = new StringBuilder();
        for(Map.Entry<String,Integer> app : map.entrySet())
        {
            S.append(app.getKey());
            S.append(app.getValue());
        }
        return S.toString();
    }

    public static void main(String[] args) {

        HashMap<String,Integer> obj = new HashMap<>();
        obj.put("map.entrySet()",1);
        obj.put("StringBuilder",2);

        Assignment4Q7 obj1 = new Assignment4Q7();
        System.out.println(obj1.convertKeyValueToString(obj));
    }
}
