public class Solution {
    public int climbStairs(int n) {
    if(n<1) return 0;
    if(n==1) return 1;
    int[] count=new int[n+1];
    count[0]=1;
    count[1]=1;
    int temp=2;
    while(temp<=n){
        count[temp]=count[temp-1]+count[temp-2];
        temp++;
    }
    return count[n];
    }
}