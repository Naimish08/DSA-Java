package BasicMaths;

public class Gcd {
    public static void main(String[] args) {
        int n1 = 12,n2 = 6;
        int greatest = 1;
        if(n1>=n2){
            for(int i=1;i<=Math.sqrt(n2);i++){
                if((n1%i==0 && n2%i==0)){
                    greatest=Math.max(i,greatest);
                }
                if(n1%(n1/i)==0 && n2%(n1/i)==0){
                    greatest=Math.max(n1/i,greatest);
                }
                if(n1%(n2/i)==0 && n2%(n2/i)==0){
                    greatest=Math.max(n2/i,greatest);
                }
            }
        }
        else{
            for(int i=1;i<=Math.sqrt(n1);i++){
                if((n1%i==0 && n2%i==0)||(n1%(n1/i)==0 && n2%(n1/i)==0)||(n1%(n2/i)==0 && n2%(n2/i)==0)){
                    greatest=i;
                }
            }
        }
        System.out.println(greatest);
    }
}
