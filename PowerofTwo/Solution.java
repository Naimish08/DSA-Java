package PowerofTwo;
class Solution {
    public boolean isPowerOfTwo(int n) {
        int size = log2(n)+1;
        int mask = (1<<(size))-1;
        int final_flipped = ~n & mask;
        //System.out.println(Integer.toBinaryString(final_flipped));
        if((n & final_flipped) == 0){
            return true;
        }
        return false;
    }

    public static int log2(int N)
    {
        int result = (int)(Math.log(N) / Math.log(2));

        return result;
    }
}

