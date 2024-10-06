package Algo.Searching.Binary;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class RotatedArray {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,0,1,2};
        int target=5;
    }
    static int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        int start = 0;
        int end = nums.length - 1;
        //if u didn't get a pivot that means the array is not rotated so
        // just simple bs
        if (pivot == -1) {
            return BinarySearch(nums,target,start,end);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if(target>=nums[start]){
            return BinarySearch(nums,target,start,pivot-1);
        }
        if(target<nums[start]){
            return BinarySearch(nums,target,pivot+1,end);
        }
        return -1;
    }
    static int findpivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            //4 cases
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return (mid-1);
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int BinarySearch(int[] arr,int search,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (search<arr[mid]){
                end=mid-1;
            } else if (search>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
