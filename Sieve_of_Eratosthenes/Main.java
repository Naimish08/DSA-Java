package Sieve_of_Eratosthenes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int max = 10;
        int[] isprime = new int[max+1];
        Arrays.fill(isprime,1);

        for (int i = 2; i < max+1; i++) {
            if(isprime[i] == 1){
                for(int j = 2*i;j<max+1;j+=i){
                    isprime[j] = 0;
                }
            }
        }

        System.out.println(Arrays.toString(isprime));
    }
}
