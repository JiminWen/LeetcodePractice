public class Solution {
    public int uniquePaths(int m, int n) {
    int temp=m+n-2,k=m-1;
    double res=1;
    for(int i=1;i<=k;++i){
        res=res*(temp-i+1);
    }
    for(int i=1;i<=k;++i){
        res=res/i;
    }
    return (int)Math.round(res);
    }
}