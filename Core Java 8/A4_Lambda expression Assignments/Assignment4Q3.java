package com.company;
import java.util.function.*;

public class Assignment4Q3 {

    static int modifyValue(int i,Function<Integer,Integer> j)
    {
        return j.apply(i);
    }
    static class Product
    {
        private int val = 10;

        public void setVal(int val)
        {
            this.val = val;
        }

        public int getVal()
        {
            return this.val;
        }
    }
    static void display()
    {
        Supplier<Integer> o1 = () -> 10;
        System.out.println(o1.get());

        Consumer<Integer> o2 = obj -> System.out.println(obj);
        o2.accept(10);

        Predicate<Integer> o3 = obj -> (obj!=10);
        System.out.println(o3.test(10));

        Function<Integer,Integer> o4 = obj -> obj * 10;
        System.out.println(o4.apply(10));
    }

    public static void main(String[] args) {

        display();

        //modifyValue(10,obj -> obj+10);


    }
}
