public class Solution {
    public int threeSumSmaller(int[] nums, int target) {
    if(nums==null||nums.length==0){
        return 0;
    }
    int count=0;
    Arrays.sort(nums);
    for(int i=0;i<nums.length-2;++i){
        int temp=target-nums[i];
        int l=i+1,r=nums.length-1;
        while(l<r){
            int sum=nums[l]+nums[r];
            if(sum<temp){
                count+=r-l;
                l++;
                
            }
            else{
                r--;
            }
        }
    }
    return count;
    }
}