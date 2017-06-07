public class Solution {
    public int findUnsortedSubarray(int[] nums) {
    if(nums==null||nums.length==0){
        return 0;
    }   
    int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,begin=-1,end=-1;
    for(int i=0;i<nums.length;++i){
        max=Math.max(max,nums[i]);
        if(max>nums[i]){
            end=i;
        }
        min=Math.min(min,nums[nums.length-1-i]);
        if(min<nums[nums.length-1-i]){
            begin=nums.length-1-i;
        }
    }
    if(begin==-1) return 0;
    return end-begin+1;
    }
}

This is a two pointer problem. We need to find the start and the end index of unsorted array to get the result. The intuitive idea is that a 
sorted array should satisfy that the maximum value is at the end and the min value is at the beginning. In other words, if we can find a value that is NOt larger than 
all the items on the left, the array is unsorted. And the value is the end of the unsorted list. Based on the same idea, we can find the beginnign of the unsorted
array.