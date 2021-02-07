package com.company;

class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max) {
        int temp1, temp2, remender;
        int num=0,j=0,sum=0;
        int [] arr1=new int[10];
        for(int i=min+1;i<=max;i++)
        {
            temp1=temp2=i;
            while(temp1!=0)
            {
                temp1 /=10; ++num;
            }
            while(temp2 !=0)
            {
                remender=temp2 %10;
                sum +=Math.pow(remender,num);
                temp2 /=10;
            }
            if(sum ==i)
            {
                arr1[j]=i;
                j++;
            }
            sum=0;
            num=0;

        }
        return arr1;
    }
}

public class Assignment1Q2 {
    public static void main(String[] args) {
        int min = 100;
        int max = 999;
        ArmstrongNumBetweenRange obj = new ArmstrongNumBetweenRange();
        int[] arr=obj.armstrongNumbersInRange(min,max);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }

    }
}
