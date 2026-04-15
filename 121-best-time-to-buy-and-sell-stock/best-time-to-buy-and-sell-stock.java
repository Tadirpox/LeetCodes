class Solution {
    public int maxProfit(int[] prices) {
        int output=0;
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min=prices[i];
                index=i;
                for(int j=index+1; j<prices.length; j++){
                    if((prices[j]-min)>output)
                    output= prices[j]-min;
                }
            }
        }
        
        return output;
    }
}