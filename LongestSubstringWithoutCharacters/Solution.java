package LongestSubstringWithoutCharacters;

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0,ans = 0;
        int l = 0,r = 0;
        if(s.equals(" ")){
            return 1;
        }
        while(r<s.length()){
            if(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }else{
                set.add(s.charAt(r));
                r++;
                ans = Math.max(ans, set.size());
            }
        }
        return ans;
    }
}
