package Algo.Sorting;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        int n=arr.length;
        System.out.println(Arrays.toString(sort(arr, n)));
    }
    static int[] sort(int[] arr,int n){
        int min=0;
        int temp;
        for(int i=0;i<n-1;i++) {
            for(int j=i;j<n;j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
}
