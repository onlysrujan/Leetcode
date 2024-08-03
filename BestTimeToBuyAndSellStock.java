class Solution {
    public int maxProfit(int[] prices) {
        int low=0;
        int pro=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<prices[low]){
                low=i;
            }
            if(prices[i]-prices[low]>pro && low!=i){
                pro=prices[i]-prices[low];
            }
        }
        return pro;
    }
}
