public class Solution {
    public int findPeakElement(int[] nums) {
    if(nums==null||nums.length==0){
        return 0;
    }    
    int l=0,h=nums.length-1;
    while(l<h){
        int mid1=l+(h-l)/2;
        int mid2=mid1+1;
        if(nums[mid1]<nums[mid2]){
            l=mid2;
        }
        else{
            h=mid1;
        }
    }
    return l;
    }
}