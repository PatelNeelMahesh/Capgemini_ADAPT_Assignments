package com.company;

class ArmstrongOrNot{
    public boolean armstrongCheck(int num){
        int number = num;
        int result=0,power=0,new_num=num;
        while (new_num != 0) {
            new_num /= 10;
            power++;
        }
        while(num!=0)
        {
            int remender=num%10;
            result+=Math.pow(remender, power);
            num/=10;
        }
        if(number==result){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Assignment1Q1 {
    public static void main(String[] neel) {
        ArmstrongOrNot obj = new ArmstrongOrNot();
        System.out.println(obj.armstrongCheck(371));
    }
}
