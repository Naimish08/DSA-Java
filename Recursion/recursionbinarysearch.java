package Recursion;
public class recursionbinarysearch {
    public static void main(String[] args) {
        int[] arr={7,9,10,16,25,87};
        int start=0;
        int end=arr.length-1;
        int target=16;
        System.out.println(search(arr, target, start, end));
    }

    static int search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target>arr[mid]){
            return search(arr, target, mid+1, end);
        }
        return search(arr, target, start, mid-1);
    }
}
