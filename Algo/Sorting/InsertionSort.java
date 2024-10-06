package Algo.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        int n=arr.length;
        System.out.println(Arrays.toString(sort(arr,n)));
    }
    static int[] sort(int[] arr,int n){
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    j=0;
                }
            }
        }
        return arr;
    }
}
