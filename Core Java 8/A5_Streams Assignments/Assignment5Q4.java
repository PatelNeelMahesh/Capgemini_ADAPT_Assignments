package com.company;

import java.util.*;
import java.util.stream.Collectors;

class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}

public class Assignment5Q4 {

    public static List<Transaction> sortTransactions(List<Transaction> transactions) {
        List<Transaction> obj1 = new ArrayList<Transaction>();
        obj1 = transactions.stream().filter(a -> a.getYear() == 2011).collect(Collectors.toList());
        return obj1.stream().sorted((f1, f2) -> f1.getValue() - f2.getValue()).collect(Collectors.toList());

    }

    public static List<Integer> transaction3sValuesDelhi(List<Transaction> transactions) {
        List<Transaction> obj2 = new ArrayList<>();
        List<Integer> d = new ArrayList<>();

        obj2 = transactions.stream().filter(b -> b.getTrader().getCity().contentEquals("Delhi")).collect(Collectors.toList());
        obj2.stream().forEach(b -> d.add(b.getValue()));
        return d;
    }

    public static int highestTransaction2(List<Transaction> transactions) {
        Optional<Transaction> obj3 = transactions.stream().max(Comparator.comparing(Transaction::getValue));
        Transaction obj = obj3.stream().findFirst().get();
        return obj.getValue();

    }

    public static int smallestTransaction1(List<Transaction> transactions) {
        Optional<Transaction> obj4 = transactions.stream().min(Comparator.comparing(Transaction::getValue));
        Transaction obj = obj4.stream().findFirst().get();
        return obj.getValue();
    }

    public static void main(String[] args) {
    }
}
