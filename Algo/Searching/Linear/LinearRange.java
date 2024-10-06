package Algo.Searching.Linear;
public class LinearRange {
    public static void main(String[] args) {
        int[] arr={58,69,75,13,42};
        int start=1;
        int end=4;
        int target=75;
        System.out.println(linearsearch(arr, start, end, target));
    }
    
    static int linearsearch(int[] arr,int start,int end,int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=start;i<end;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}