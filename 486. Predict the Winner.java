public class Solution {
    public boolean PredictTheWinner(int[] nums) {
        return helper(nums,0,nums.length-1,new Integer[nums.length][nums.length])>=0;
    }
    public int helper(int[] nums,int start,int end,Integer[][] mem){
        if(start==end) return nums[start];
        if(mem[start][end]==null){
        int first=nums[start]-helper(nums,start+1,end,mem);
        int last=nums[end]-helper(nums,start,end-1,mem);
        mem[start][end]=Math.max(first,last);
        }
        return mem[start][end];
    }
}