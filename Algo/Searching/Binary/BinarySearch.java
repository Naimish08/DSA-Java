package Algo.Searching.Binary;
//used for sorting arrays
//Order-Agnostic Binary Search:-We don't know whether the array is sorted in ascending or descending
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        int search=36;
        int[] arr2={48,36,20,14,12,11,9,6,4,2};
        System.out.println(search(arr, search));
        System.out.println(search(arr2, search));

    }
    static int search(int[] arr,int search){
        int start=0;
        int end=arr.length-1;
        if(arr[start]<arr[end]){
            while (start<=end){
                int mid=start+(end-start)/2;
                //Efficient way to find the mid value as integer has limit on what all value it can operate
                //so some times it shows error for big values
                if(search<arr[mid]){
                    end=mid-1;
                }
                else if(search>arr[mid]){
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }
        }
        //Descending Order
        else if(arr[start]>arr[end]){
            while (start<=end){
                int mid=start+(end-start)/2;
                if(search>arr[mid]){
                    end=mid-1;
                }
                else if(search<arr[mid]){
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }  
        }
        return -1;
    }
}