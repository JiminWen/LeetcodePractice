public class Solution {
    public int singleNumber(int[] nums) {
    int xor=0;
    for(int i=0;i<=nums.length-1;++i){
        xor^=nums[i];    
    }
    return xor;
    }
}                                                                                                                   