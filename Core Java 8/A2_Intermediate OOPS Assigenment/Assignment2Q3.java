package com.company;

import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
        return totalDeposits-creditLimit;
    }
}

class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
        return totalDeposits+fixedDepositAmount;
    }
}

public class Assignment2Q3 {
    public static int totalCashInBank(ArrayList<Integer> cash){
        return cash.get(0)+cash.get(1);
    }
    public int getCash(){
        return 1;
    }
    public static void main(String[] args) {
        CurrentAccount c = new CurrentAccount();
        SavingsAccount s = new SavingsAccount();

        ArrayList<Integer> money = new ArrayList<Integer>();
        money.add(c.getCash());
        money.add(s.getCash());

        System.out.println(totalCashInBank(money));

    }

}
