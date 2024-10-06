package Extra;

import java.util.Scanner;

public class Printing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            res[i] = 0;
        }

        for(int i = 1; i < n; i++) {
            int j = i - 1;
            while (j >= 0 && arr[j] >= arr[i]) {
                j = res[j] - 1;
            }
            if (j >= 0) {
                res[i] = j + 1;
            }
        }
        for(int i=0;i<n;i++) {
            System.out.println(res[i]);
        }
    }
}

