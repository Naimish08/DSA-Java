import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class parsetry {
    public static void main(String[] args) {
        List<String> timePoints = new ArrayList<>();
        timePoints.add("23:59");
        timePoints.add("00:00");
        Solution obj = new Solution();
        System.out.println(obj.findMinDifference(timePoints));
    }
}
class Solution {
    public int findMinDifference(List<String> timePoints) {
        int size = timePoints.size();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            String s = timePoints.get(i);
            arr[i] = Integer.parseInt(s.substring(0,2))*60 + Integer.parseInt(s.substring(3,5));
        }
        Arrays.sort(arr);
        int result = Integer.MAX_VALUE;
        for(int i=1;i<size;i++){
            result = Math.min(result,arr[i]-arr[i-1]);
        }
        result = Math.min(result,1440-(arr[size-1]-arr[0]));
        return result;
    }
}