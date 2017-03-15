public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
    if(nums==null||nums.length==0) return 0;
    int start=0,end=0,sum=0,min=Integer.MAX_VALUE;
    while(end<nums.length){
        sum+=nums[end];
        while(sum>=s){
            min=Math.min(min,end-start+1);
            sum-=nums[start];
            start++;
            
        }
        end++;
    }
    return min==Integer.MAX_VALUE?0:min;
    
    
    }
}