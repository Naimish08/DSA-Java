package SubarraywithAbsoluteDifference;
class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int l = 0,r = 0;
        int ans = 0,min = Integer.MAX_VALUE,count = 0;
        while(r<nums.length){
            if(l == r){
                count++;
                ans = Math.max(ans,count);
                min = Math.min(min,nums[r]);
                r++;
            }else if(limit>=Math.abs(nums[r]-min)){
                count++;
                ans = Math.max(ans,count);
                min = Math.min(min,nums[r]);
                r++;
            }else{
                ans = Math.max(ans,count);
                count = 0;
                min = Integer.MAX_VALUE;
                l++;
            }
        }
        return ans;
    }
}
