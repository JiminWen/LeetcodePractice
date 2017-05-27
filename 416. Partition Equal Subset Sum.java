public class Solution {
    public boolean canPartition(int[] nums) {
    if(nums==null||nums.length==0)  return true;
    int sum=0;
    for(int i:nums){
        sum+=i;
    }
    if(sum%2==1) return false;
    int t=sum/2;
    boolean[] res=new boolean[t+1];
    res[0]=true;
    for(int i=0;i<nums.length;++i){
        for(int j = t; j >= nums[i]; j--){
            res[j]=res[j]||res[j-nums[i]];    
        }
    }
    return res[t];
    }
}