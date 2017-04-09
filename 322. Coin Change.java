public class Solution {
    public int coinChange(int[] coins, int amount) {
    if(coins==null||coins.length==0||amount<1) return 0;    
    int[] min=new int[amount+1];
    Arrays.fill(min,Integer.MAX_VALUE);
    min[0]=0;
    for(int i=1;i<=amount;++i){
        min[i]=Integer.MAX_VALUE;
        for(int num:coins){
            if(num<=i&&min[i-num]!=Integer.MAX_VALUE){
                min[i]=Math.min(min[i],min[i-num]+1);
            }    
        }
    }
    return min[amount]==Integer.MAX_VALUE?-1:min[amount];
    }
}