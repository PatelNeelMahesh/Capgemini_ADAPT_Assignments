package com.company;
import java.util.*;

class BubbleSort{

public int[] bubbleSort(int arr[])
    {
        Arrays.sort(arr);
        return arr;
    }
}

public class Assignment1Q8 {
    public static void main(String[] args) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        BubbleSort obj = new BubbleSort();
        arr = obj.bubbleSort(arr);
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
