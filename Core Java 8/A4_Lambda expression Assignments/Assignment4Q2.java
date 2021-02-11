package com.company;
import java.util.ArrayList;
import java.util.Iterator;

public class Assignment4Q2 {
    private int totalPrice;
    private String status;

    public Assignment4Q2(int tp, String s)
    {
        this.totalPrice = tp;
        this.status = s;
    }

    public int getP()
    {
        return this.totalPrice;
    }

    public String getS()
    {
        return this.status;
    }

    public void setP(int tp)
    {
        this.totalPrice=tp;
    }

    public void set(String s)
    {
        this.status=s;
    }

    public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders)
    {
        Iterator<Assignment4Q2> i = orders.iterator();
        while (i.hasNext())
        {
            Assignment4Q2 obj = i.next();
            if(obj.getP()>=10000 && obj.getS().equals("Accepted")) {}
            else if(obj.getP()>=10000 && obj.getS().equals("Completed")){}
            else { i.remove(); }
        }
        return orders;
    }

    public static void main(String[] args) {

        Assignment4Q2 a1 = new Assignment4Q2(10000,"Accepted");
        Assignment4Q2 a2 = new Assignment4Q2(11000,"Completed");
        Assignment4Q2 a3 = new Assignment4Q2(9000,"Accepted");

        ArrayList<Assignment4Q2> obj = new ArrayList<Assignment4Q2>();
        obj.add(a1);
        obj.add(a2);
        obj.add(a3);

        obj = listOfOrders(obj);

        obj.forEach((order) -> {
            System.out.println(order.getP()+" "+order.getS());});
    }
}
