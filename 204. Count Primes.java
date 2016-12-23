public class Solution {
    public int countPrimes(int n) {
    if(n<1){
        return 0;
    }
    int count=0;
    boolean[] not=new boolean[n];
    for(int i=2;i<=n-1;++i){
        if(not[i]==false) {
        count++;
        
        for(int j=2;i*j<n;++j){
            not[i*j]=true;
        }
        }
    }
    return count;
    }
}