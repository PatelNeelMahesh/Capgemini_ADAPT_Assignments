package com.company;

import java.util.ArrayList;

public class Assignment4Q4 {

    public ArrayList<String> removeOddLength(ArrayList<String> employeeList)
    {
        employeeList.removeIf(obj -> obj.length()%2 !=0);
        return employeeList;
    }

    public static void main(String[] args) {
        Assignment4Q4 obj = new Assignment4Q4();
        ArrayList<String> list = new ArrayList<>();

        list.add("even");
        list.add("odd");
        System.out.println(obj.removeOddLength(list));
    }
}
