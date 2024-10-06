package Algo.Searching.Binary;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        int search=9;
        System.out.println(ans(arr,search));
    }
    static int ans(int[] arr,int search){
        int start=0;
        int end=1;
        while(search>arr[end]){
            int temp=end+1;
            end+=(end-start+1)*2;
            start=temp;
        }
        return BinarySearch(arr,search,start,end);
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
