package Algo.Searching.Linear;
public class Linear{
    public static void main(String[] args) {
        int[] arr={58,69,75,13,42};

        int search=13;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println(i);
            }
            else{
                System.out.println("0");
            }
        }
    }
}