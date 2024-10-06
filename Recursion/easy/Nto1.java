package Recursion.easy;

public class Nto1 {
    public static void main(String[] args) {
        fun(5);
        System.out.println(fact(4));
    }

    static void fun(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    static int fact(int n){
        if(n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
}
