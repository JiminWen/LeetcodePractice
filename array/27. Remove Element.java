public class Solution {
    public int removeElement(int[] nums, int val) {
    if(nums==null||nums.length==0){
        return 0;
    }    
    int counter=0;
    for(int i=0;i<=nums.length-1;++i){
        if(nums[i]==val){
            ++counter;
        }
        else{
        nums[i-counter]=nums[i];
        }
    }
    return (nums.length-counter);
    }
    
    
}