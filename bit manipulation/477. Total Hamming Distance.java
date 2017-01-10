public class Solution {
    public int totalHammingDistance(int[] nums) {
    int total=0,n=nums.length;
    for(int i=0;i<=31;++i){
        int one=0;
        for(int j=0;j<=n-1;++j){
            one+=(nums[j]>>i)&1;
            
        }
        total+=one*(n-one);
    }
    return total;
    }
}