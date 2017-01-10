public class Solution {
    public int minCostII(int[][] costs) {
    if (costs == null || costs.length == 0) return 0;
    int min1=-1,min2=-1;
    for(int i=0;i<=costs.length-1;++i){
        int last1=min1,last2=min2;
        min1=-1;
        min2=-1;
        for(int j=0;j<=costs[0].length-1;++j){
        if(j!=last1&&i!=0){
            costs[i][j]+=costs[i-1][last1];    
        }   
        if(j==last1&&i!=0){
            costs[i][j]+=costs[i-1][last2];    
        }
        if(min1<0||costs[i][j]<costs[i][min1]){
            min2=min1;
            min1=j;
            
        }
        else if(min2<0||costs[i][j]<costs[i][min2]){
            min2=j;
        }
            
        }
    }
    return costs[costs.length-1][min1];
    
    }
}