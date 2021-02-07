package com.company;

class SiCi{
    public double simpleInterest(double principalAmount,int time,double interestRate){
        double s_interest = (principalAmount*time*interestRate)/100;
        return s_interest;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        double c_interest = principalAmount * (Math.pow((1+interestRate/100),(time))) - principalAmount;
        return c_interest;
    }
}

public class Assignmenet1Q3 {
    public static void main(String[] args) {
        SiCi obj = new SiCi();

        System.out.println(obj.simpleInterest(10000,2,10));
        System.out.println(obj.compoundInterest(10000,2,10));
    }

}
