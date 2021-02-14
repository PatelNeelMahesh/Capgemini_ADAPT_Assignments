package com.company;

import java.util.*;
import java.util.stream.Collectors;

class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

public class Assignment5Q3 {
    public static List<String> printUniqueCities(List<Trader> traders) {
        List<String> uc = new ArrayList<>();
        List<String> ac = new ArrayList<>();
        traders.stream().forEach(a -> ac.add(a.getCity()));
        uc =  ac.stream().distinct().collect(Collectors.toList());
        return uc;
    }

    public static List<String> trader2sFromPuneSortByName(List<Trader> traders) {
        List<String> pt = new ArrayList<>();
        traders.stream().filter(b -> b.getCity().equalsIgnoreCase("Pune")).forEach(i -> pt.add(i.getName()));
        pt.stream().sorted((trader1, trader2) -> trader1.compareTo(trader2));
        return pt;
    }

    public static String allTrader3Names(List<Trader> traders) {
        List<String> obj = new ArrayList<>();
        traders.stream().forEach(c -> obj.add(c.getName()));
        obj.stream().sorted((trader1, trader2) -> trader1.compareTo(trader2));
        String l = "";
        for (String s : obj) {l = l + s;}
        return l;
    }

    public static ArrayList<Trader> areAnyTrader4sFromIndore(ArrayList<Trader> traders) {
        ArrayList<Trader> it= new ArrayList<>();
        it=(ArrayList<Trader>) traders.stream().filter(d -> d.getCity().equalsIgnoreCase("Indore")).collect(Collectors.toList());
        return it;
    }

    public static void main(String[] args) {
    }
}
