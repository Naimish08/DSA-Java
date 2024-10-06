package Algo.Sorting;
import java.util.Arrays;

public class Cyclo {
    public static void main(String[] args) {
        int[] arr={3,5,1,2,4};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        int temp;
        int i=0;
        while (i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                temp=arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}
