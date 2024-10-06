public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {3,0,1};
        System.out.println(missingNumber(arr));
    }
    static public int missingNumber(int[] arr) {
        arr=MissingNumber(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
    }
    static int[] MissingNumber(int[] arr){
        int i=0;
        int temp;
        while (i<arr.length) {
            int correct=arr[i];
            if (arr[i]<arr.length && arr[i]!= correct){
                temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}
