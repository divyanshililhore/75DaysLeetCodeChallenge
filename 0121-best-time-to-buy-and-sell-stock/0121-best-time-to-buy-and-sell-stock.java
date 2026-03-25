class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
int maxsum = 0;
int i = 0;int j = 0;
while(j<n){
    if(prices[i]<prices[j]){
           int sum = prices[j]-prices[i];
           j++;
           maxsum = Math.max(maxsum,sum);
        }
        else if(prices[i]>prices[j]){
            i++;
            j = i+1;
        }
        else{
            j++;
        }
}
        return maxsum;
}
    } 
    