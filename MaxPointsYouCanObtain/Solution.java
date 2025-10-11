package MaxPointsYouCanObtain;

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum = 0;
        for(int i=0;i<k;i++){
            lsum += cardPoints[i];
        }
        int max = lsum,rsum=0,r=n-1;
        for(int i=k-1;i>=0;i--){
            lsum -= cardPoints[i];
            rsum += cardPoints[r];
            r--;
            max = Math.max(max,lsum+rsum);
        }
        return max;
    }
}
