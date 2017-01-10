public class Solution {
    public int minCost(int[][] costs) {
    if(costs==null||costs.length==0||costs[0].length==0){
        return 0;
    }    
    int lastr=0,lastb=0,lastg=0;
    for(int i=0;i<=costs.length-1;++i){
        int curr=Math.min(costs[i][0]+lastb,costs[i][0]+lastg);
        int curb=Math.min(costs[i][1]+lastr,costs[i][1]+lastg);
        int curg=Math.min(costs[i][2]+lastr,costs[i][2]+lastb);
        lastr=curr;
        lastb=curb;
        lastg=curg;
    }
    return Math.min(Math.min(lastr,lastb),lastg);
    }
}