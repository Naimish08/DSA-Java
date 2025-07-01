package BasicMaths;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n = 371;
        int sum = 0,count = 0;
        int temp = n;
        while(n>0){
            n = n/10;
            count++;
        }
        n = temp;
        while(n>0){
            int lastDigit = n%10;
            n =  n/10;
            sum += (int)Math.pow(lastDigit,count);
        }
        System.out.println(sum);
    }
}
