class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int empty=numBottles,drink=numBottles;
        numBottles=0;
        while(empty>=numExchange)
        {
            if(empty>=numExchange)
            {
                empty-=numExchange;
                numExchange++;
                numBottles++;
            }
            drink+=numBottles;
            empty+=numBottles;
            numBottles=0;
        }
        return drink;
    }
}