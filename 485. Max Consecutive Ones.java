public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    if(nums==null||nums.length==0) return 0;
    int local=0,max=0;
    for(int temp:nums){
        if(temp==1){
            local+=1;
            max=Math.max(max,local);
        }    
        else{
            local=0;
        }
    }
    return max;
    }
}