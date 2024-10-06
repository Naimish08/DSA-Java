package Algo.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        int len=arr.length;
        int temp;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

}
