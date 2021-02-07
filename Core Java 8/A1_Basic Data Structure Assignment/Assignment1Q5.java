package com.company;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
        double tax = 0;

        if(ctc>=0 && ctc<=180000){
            tax = 0;
        }
        else if(ctc>=181001 && ctc<=300000) {
            tax = (ctc*10)/100;
        }
        else if(ctc>=300001 && ctc<=500000) {
            tax = (ctc*20)/100;
        }
        else if(ctc>=500001 && ctc<=1000000){
            tax = (ctc*30)/100;
        }

        return tax;
    }
}

public class Assignmenet1Q5 {
    public static void main(String[] args) {
        TaxAmount obj = new TaxAmount();
        System.out.println(obj.calculateTaxAmount(500000));

    }
}
