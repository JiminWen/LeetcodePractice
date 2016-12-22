public class Solution {
    public int nthUglyNumber(int n) {
    if(n<1){
        return 0;
    }
    int[] res=new int[n];
    res[0]=1;
    int count=1;
    int a=0,b=0,c=0;
    int min=1;
    while(count<=n-1){
        min=Math.min(res[a]*2,Math.min(res[b]*3,res[c]*5));
        res[count++]=min;
        if(min==res[a]*2) ++a;
        if(min==res[b]*3) ++b;
        if(min==res[c]*5) ++c;
    }
    return res[n-1];
    }
}