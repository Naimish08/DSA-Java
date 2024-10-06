package Algo.Searching.Binary;

public class BinaryDescendingCeiling {
    public static void main(String[] args) {
        int[] arr={18,16,14,9,5,3,2};
        int target=15;
        System.out.println(arr[search(arr, target)]);
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                end=mid-1;
            }
            else if(target<arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
