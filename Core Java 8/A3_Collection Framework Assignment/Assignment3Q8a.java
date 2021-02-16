package com.company;

import java.util.*;

public class Assignment3Q8a {

    public static void failFast(Map<String, String> cityCode){
        Iterator obj = cityCode.keySet().iterator();

        while (obj.hasNext())
        {
            System.out.println(cityCode.get(obj.next()));
            cityCode.put("LA","USA");
        }
    }

    public static void main(String[] args) {

        Map<String,String> obj = new HashMap<String,String>();
        obj.put("Paris","France");
        obj.put("Mumbai","India");
        failFast(obj);

    }
}
