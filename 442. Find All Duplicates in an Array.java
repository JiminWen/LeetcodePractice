public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    List<Integer> res=new ArrayList<>();
    if(nums==null||nums.length==0) return res;
    for(int temp:nums){
    int index=Math.abs(temp)-1;
        if(nums[index]<0){
        res.add(index+1);    
        }
    nums[index]*=-1;    
    }
    return res;
    
    }
}