public class Solution {
    public int[] countBits(int num) {
    
    int[] res=new int[num+1];
    res[0]=0;
    if(num==0) return res;
    int boundary=2,cur=1,i=0;
    while(cur<=num){
        while(cur<boundary&&cur<=num){
            res[cur++]=res[i++]+1;    
        }
        boundary<<=1;
        i=0;
        
    }
    return res;
    }
}


public int[] countBits(int num) {
    int[] f = new int[num + 1];
    for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
    return f;
}