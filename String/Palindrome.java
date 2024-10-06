package String;

public class Palindrome {
    public static void main(String[] args) {
        String p="abcba";
        char[] arr=p.toCharArray();
        if(palindromecheck(arr)){
            System.out.println("It's a palindrome number");
        }
        else {
            System.out.println("It's not a palindrome number");
        }
    }
    static boolean palindromecheck(char[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            if(arr[start]!=arr[end]){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}
