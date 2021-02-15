package com.company;

import java.util.HashMap;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public int hashCode()
    {
        return 1;
    }

    @Override
    public boolean equals(Object obj)
    {
        return true;
    }
}

public class Assignment3Q5 {
    public static void main(String[] args) {
        HashMap<Employee, String> obj = new HashMap<>();

        Employee e1 = new Employee("Aman",1);
        Employee e2 = new Employee("Akash",2);
        Employee e3 = new Employee("Amy",3);
        obj.put(e1,e1.getName());
        obj.put(e2,e2.getName());
        obj.put(e3,e3.getName());

        e1.setName("Aman Kumar");
        System.out.println(obj.get(e1));
        System.out.println(obj.get(e2));
        System.out.println(obj.get(e3));
    }
}
