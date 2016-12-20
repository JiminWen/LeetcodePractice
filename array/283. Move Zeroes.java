public class Solution {
    public void moveZeroes(int[] nums) {
    if(nums==null||nums.length==0){
        return;
    }
    int counter=0;
    for(int i=0;i<=nums.length-1;++i){
        if(nums[i]==0){
            ++counter;
        }
        else{
        nums[i-counter]=nums[i];
        }
    }
    for(int i=nums.length-counter;i<=nums.length-1;++i){
        nums[i]=0;
    }
    }
}