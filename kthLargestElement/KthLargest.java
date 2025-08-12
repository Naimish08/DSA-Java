package kthLargestElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    int k;
    int[] nums;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        for(int i:nums){
            pq.add(i);
        }
    }
    public int add(int val) {
        pq.add(val);
        int ans = 0;
        int temp = k;
        List<Integer> list = new ArrayList<>();
        while(k>0){
            ans = pq.poll();
            list.add(ans);
            k--;
        }
        k = temp;
        pq.addAll(list);
        list.clear();
        return ans;
    }
}
