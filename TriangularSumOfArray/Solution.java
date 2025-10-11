package TriangularSumOfArray;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> list = new LinkedList<>();
        List<Integer> temp = new LinkedList<>();
        for(int i:nums){
            list.add(i);
        }
        int sum = 0;
        while(list.size()>1){
            int l = 0,r = 1;
            int n;
            while(list.size()>1){
                int first = list.get(0);
                int second = list.get(1);
                sum = (first+second)%10;
                list.remove(0);
                temp.add(sum);
            }
            list.remove(0);
            for(Integer j:temp){
                list.add(j);
            }
            temp.clear();
        }
        return list.get(0);
    }
}