package BasicMaths;

public class Main {
    public static void main(String[] args) {
        int n = 7789;
        System.out.println(7789%10); //To get the last digit
        System.out.println(7789/10); //Remove the last digit
        int digit = 0;
        while(n>0){
            digit++;
            n = n/10;
        }
        System.out.println("No. of Digits: "+digit);
    }
}
