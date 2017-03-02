public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    if(nums==null||nums.length==0) return 0;
    int pre=-1,cur=0,max=0;
    for(int i=0;i<nums.length;++i){
        if(nums[i]==1){
            cur++;
        }
        else{
            pre=cur;
            cur=0;
        }
        max=Math.max(max,1+cur+pre);
    }
    return max;
    }
}