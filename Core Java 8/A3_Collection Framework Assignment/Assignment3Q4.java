package com.company;

import java.util.*;

class DateClass {
    private int date;
    private int month;
    private int year;

    public DateClass(int date, int month, int year)
    {
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public DateClass(){}

    public int getDate() {
        return date;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, month);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DateClass other = (DateClass) obj;
        return month == other.month && date == other.date;
    }
}

public class Assignment3Q4 {
    public String getEmployee(HashMap<DateClass, String> dob, String employeeName){
        Set<Map.Entry<DateClass, String>> empEntry = dob.entrySet();
        for (Map.Entry<DateClass, String> emp : empEntry) {
            if (emp.getValue().equals(employeeName)) {
                return employeeName;
            }
        }
        return "failed";
    }
    public static void main(String[] args) {
    }
}
