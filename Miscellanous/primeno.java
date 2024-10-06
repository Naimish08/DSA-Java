package Miscellanous;
//In here we are solving the qtn:-find prime numbers till n
//Sieve of Eratosthenes is one of the most efficient ways to find all primes smaller than n
//https://www.geeksforgeeks.org/sieve-of-eratosthenes/
public class primeno {
    public static void main(String[] args) {
        int n=40;
        boolean[] primes=new boolean[n+1];
        sieve(n, primes);
    }

    static void sieve(int n,boolean[] primes){
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=i*2;j<=n;j+=i){
                    primes[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
    
}
//In here false means it is a prime number and true is not a prime number as by default in a boolena array everything is false so the only multiples we select are true which means not prime and the remaining one are false meaning prime numbers