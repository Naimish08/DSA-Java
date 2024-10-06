package Miscellanous.removeDuplicates;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0,j = 1;
        if(nums.length<1){
            return nums.length;
        }
        int z = 0;
        int k = 0;
        while(j<nums.length){
            if(nums[i] == nums[j]){
                if(j == nums.length-1){
                    nums[z++] = nums[j];
                }
                j++;
            }
            else if(nums[i] != nums[j]) {
                nums[z++] = nums[i];
                k++;
                i = j;
                j++;
                if(j == nums.length){
                    int temp = j-1;
                    nums[z++] = nums[temp];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return (k+1);
    }
}
