package com.company;

import java.lang.reflect.Array;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue)
    {
        int found= 0;
        for(int i=0;i<Array.getLength(arr);i++)
        {
            if(toCheckValue==arr[i])
            {
                found++;
            }
        }
        if(found>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCkeck = 19;

        SearchArray obj = new SearchArray();
        System.out.println(obj.searchArray(arr,valueToCkeck));
    }
}
