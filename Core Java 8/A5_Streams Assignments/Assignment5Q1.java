package com.company;

import java.util.*;
import java.util.stream.Collectors;

class Fruit {
    private String name;
    private int calories;
    private int price;
    private String color;

    public Fruit(String name,int calories,int price,String color)
    {
        super();
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

public class Assignment5Q1 {
    public static List<String> reverseSort(ArrayList<Fruit> fruits) {
        List<Fruit> obj1 = new ArrayList<>();
        List<String> obj2 = new ArrayList<String>();

        obj1 = fruits.stream().filter(cal -> cal.getCalories() < 100).sorted((cal1, cal2) -> cal2.getCalories()-cal1.getCalories()).collect(Collectors.toList());
        obj1.stream().sorted();
        obj1.stream().forEach(i -> {obj2.add(i.getName()); });

        return obj2;

    }
    public static ArrayList<Fruit> sort(ArrayList<Fruit> Fruits) {

        List<Fruit> obj = new ArrayList<>();
        obj = Fruits.stream().sorted((col1, col2) -> col1.getColor().compareTo(col2.getColor())).collect(Collectors.toList());

        return (ArrayList<Fruit>) obj;
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits) {

        List<Fruit> obj = fruits.stream().filter(col -> col.getColor().equalsIgnoreCase("RED")).sorted((col1,col2) -> col1.getPrice()-col2.getPrice()).collect(Collectors.toList());
        return (ArrayList<Fruit>) obj;
    }

    public static void main(String[] args) {

    }
}
