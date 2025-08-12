package productOfArray;
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = 0, r = 0;
        int[] ans = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = 1;
        suffix[nums.length-1] = 1;
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        }
        l = 0;
        r = 0;
        for(int i = 0; i < nums.length; i++){
            ans[i] = prefix[l++]*suffix[r++];
        }
        return ans;
    }
}
