package TopKFrequent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int i=0;i<=nums.length;i++){
            bucket[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            bucket[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int i = bucket.length-1, idx = 0;
        while(k>0){
            int j = 0;
            while(j<bucket[i].size() && k>0){
                res[idx++] = bucket[i].get(j++);
                k--;
            }
            i--;
        }
        return res;
    }
}
