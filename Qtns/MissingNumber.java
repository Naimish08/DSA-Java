package Qtns;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={2,0,1};
        int ans=-1;
        arr=missingNumber(arr);
        if(arr[arr.length-1]!=arr.length){
            ans=arr.length;
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=i){
                    ans=i;
                }
                else{
                    ans=-1;
                    continue;
                }
            }
        }
        System.out.println(ans);

    }
    static int[] missingNumber(int[] arr){
        int i=0;
        int temp;
        while (i<arr.length) {
            int correct=arr[i];
            if(arr[i]==arr.length){
                i++;
            }
            else if(arr[i]!=arr[correct]){
                if (arr[i]==arr.length) {
                    break;
                }
                else{
                    temp=arr[i];
                    arr[i]=arr[correct];
                    arr[correct]=temp;
                }
            }
            else{
                i++;
            }
        }
        return arr;
    }

}
