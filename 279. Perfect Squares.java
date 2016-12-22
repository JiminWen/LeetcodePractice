public class Solution {
    public int numSquares(int n) {
    if(n<1){
        return 0;
    }    
    int[] res=new int[n+1];
    Arrays.fill(res,Integer.MAX_VALUE);
    res[0]=0;
    for(int i=0;i<=n;++i){
        int sqrt=(int)Math.sqrt(i);
        if(i==sqrt*sqrt){
            res[i]=1;
        }
        for(int j=1;j<=sqrt;++j){
            res[i]=Math.min(res[i],res[i-j*j]+1);
        }
    }
    return res[n];
    }
}