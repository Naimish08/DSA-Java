package Fruit_in_Baskets;

import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 1,ans = 0,viol = 1;
        map.put(fruits[0],0);
        for(int i=1;i<fruits.length;i++){
            count++;
            if(!map.containsKey(fruits[i])){
                viol++;
                if(viol == 3){
                    ans = Math.max(ans,count);
                    count = 0;
                    viol = 0;
                    i--;
                }else{
                    map.put(fruits[i],0);
                }
            }else{
                map.put(fruits[i],0);
            }
        }
        ans = Math.max(ans,count);
        return ans;
    }
}
