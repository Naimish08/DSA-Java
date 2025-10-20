package WaterBottles2;
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int bottlesDrank = numBottles;
        int emptyBottles = numBottles;
        numBottles = 0;
        while(numBottles+emptyBottles>=numExchange){
            if(emptyBottles<numExchange){
                bottlesDrank += numBottles;
                emptyBottles += numBottles;
                numBottles = 0;
            }else{
                emptyBottles -= numExchange;
                numBottles++;
                numExchange++;
            }
        }
        bottlesDrank += numBottles;
        return bottlesDrank;
    }
}
