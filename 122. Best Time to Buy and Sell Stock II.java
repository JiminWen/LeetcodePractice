public class Solution {
    public int maxProfit(int[] prices) {
    if(prices==null||prices.length==0) return 0;
    int i=0,res=0,localmin=Integer.MAX_VALUE;
    while(i<prices.length){
        while(i<prices.length-1&&prices[i]>=prices[i+1]) i++;
        localmin=prices[i];
        i++;
        while(i<prices.length-1&&prices[i]<=prices[i+1]){
        i++;
        }
        if(i<prices.length) res+=prices[i]-localmin;
    }
    return res;
    }
}