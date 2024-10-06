package Recursion;

public class normalfibonaci{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int tempa;
        for(int i=0;i<7;i++){
            System.out.println(a+b);
            tempa=a;
            a=b;
            b=tempa+b;
        }
    }
}