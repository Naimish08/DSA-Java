package LongestRepeatingCharactersReplacement;

import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0,r = 0,maxLength = 0;
        while(r<s.length()){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(map.size()>(k+1)){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                map.entrySet().removeIf(entry -> entry.getValue() <= 0);
                l++;
            }
            maxLength = Math.max(maxLength,r-l+1);
            r++;
        }
        return maxLength;
    }
}
