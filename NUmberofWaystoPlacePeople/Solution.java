package NUmberofWaystoPlacePeople;

import java.util.Arrays;

class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int ans = 0;
        if(n == 1){
            return ans;
        }
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int r = n-1;
        int l = r-1;
        while(l>=0){
            if(points[l][0]<=points[r][0] && points[l][1]>=points[r][1]){
                ans++;
            }

            if(points[l][1]>=points[r][1]){
                r--;
            }
            l--;
        }
        return ans;
    }
}
