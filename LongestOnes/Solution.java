package LongestOnes;
class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int l = 0,r = 0,viol = 0;
        while(r<nums.length){
            if(nums[r] == 0){
                viol++;
                while (viol>k){
                    if(nums[l] == 0){
                        viol--;
                    }
                    l++;
                }
            }
            r++;
            max = Math.max(max,r-l);
        }
        return max;
    }
}
