public class Solution {
    public int arrayPairSum(int[] nums) {
    int res=0;    
    Arrays.sort(nums);
    for(int i=0;i<=nums.length-2;i+=2){
        res+=nums[i];
    }
    return res;
    }
}