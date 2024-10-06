//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
package Algo.Searching.Binary;
public class CharCeiling {
    public static void main(String[] args) {
        char[] arr={'c','d','f','j'};
        char target='j';
        System.out.println(arr[search(arr, target)]);
    }
    static int search(char[] arr,char target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start%arr.length;
        //As the qtn condition states that it is wrap around for eg if we have to find 'j'then the ans will be c as it is in a wrap around
        //Here we do % as if the ans is at array index 2,3 then  2%4,3%4 it will still be 2,3 but if it is 4%4 then it will come as 0 hence wrap aound done  
    }
}
