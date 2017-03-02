public class Solution {
    public void nextPermutation(int[] nums) {
    if(nums==null||nums.length==0) return;
    int first=-1;
    for(int i=nums.length-1;i>0;--i){
        if(nums[i]>nums[i-1]){ 
        first=i-1;
        for(int j=nums.length-1;j>first;--j){
            if(nums[j]>nums[first]) {swap(nums,first,j);
            break;
            }
        }
        break;
        }
    }
    reverse(nums,first+1,nums.length-1);    
    }
    private void swap(int[] nums,int i,int j){
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
    }   
    private void reverse(int[] nums,int i, int j){
    while(i<j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
    }   
    
    }
}