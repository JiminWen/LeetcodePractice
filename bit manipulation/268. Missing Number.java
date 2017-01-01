public class Solution {
    public int missingNumber(int[] nums) {
    int xor=0;
    for(int i=0;i<=nums.length-1;++i){
        xor=xor^i^nums[i];
    }
    return (xor^nums.length);
    }
}