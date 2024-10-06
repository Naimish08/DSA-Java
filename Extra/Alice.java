package Extra;
import java.util.*;
public class Alice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int T = s.nextInt();
        int P = s.nextInt();
        int secs = 0;
        int flag = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        while(flag != 1){
            for(int i=0;i<n;i++){
                if(arr[i]>=T) {
                    arr[i] = 0;
                }
                if(arr[i]==0){
                    count++;
                }
            }
            if(count>=P){
                flag = 1;
                break;
            }
            count = 0;
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    continue;
                }
                else {
                    arr[i] += 1;
                }
            }
            secs++;
        }
        System.out.println(secs);
    }
}
