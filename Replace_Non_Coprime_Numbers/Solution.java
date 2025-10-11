package Replace_Non_Coprime_Numbers;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> arr = new LinkedList<>();

        for(int i:nums){
            arr.add(i);
        }

        if(nums.length<=1){
            return arr;
        }

        while(true){
            int no_process = 0;
            int l = 0,r = 1;
            while(r<arr.size()){
                int num1 = arr.get(l);
                int num2 = arr.get(r);
                int gcd_val = gcd(num1, num2);
                if(arr.size()>r && gcd_val != 1){
                    arr.remove(l);
                    arr.remove(l);
                    int lcm = (num1 * num2) / gcd_val;
                    arr.add(l,lcm);
                    no_process++;
                }else{
                    l++;
                    r++;
                }
            }
            if(no_process == 0){
                break;
            }
        }
        return arr;
    }

    public int gcd(int a,int b){
        if(b == 0){
            return a;
        }

        return gcd(b,a%b);
    }
}