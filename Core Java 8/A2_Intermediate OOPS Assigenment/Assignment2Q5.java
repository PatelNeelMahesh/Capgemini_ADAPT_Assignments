package com.company;

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
        return "Rectangle";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
        return "Line";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
        return "Cube";
    }
}

abstract class Shape5 {
    abstract public String draw();
}

public class Assignment2Q5 {
    public static void main(String[] args) {

        Shape5 obj = new Rectangle5();
        Shape5 obj1 = new Line5();
        Shape5 obj2 = new Cube5();
        System.out.println(obj.draw());
        System.out.println(obj1.draw());
        System.out.println(obj2.draw());

    }

}
