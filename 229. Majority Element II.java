public class Solution {
    public List<Integer> majorityElement(int[] nums) {
    List<Integer> res=new ArrayList<>();
    if(nums==null||nums.length==0) return res;
    int max1=nums[0],max2=nums[0];
    int count1=0,count2=0;
    for(int temp:nums){
        if(temp==max1){
            count1++;
        }
        else if(temp==max2){
            count2++;
        }
        else if(count1==0){
            max1=temp;
            count1=1;
        }
        else if(count2==0){
            max2=temp;
            count2=1;
        }
        else{
            count1--;
            count2--;
        }
    }
    count1=0;
    count2=0;
    for(int temp:nums){
        if(temp==max1) count1++;
        if(temp==max2) count2++;
    }
    if(count1>nums.length/3) res.add(max1);
    if(count2>nums.length/3&&max2!=max1) res.add(max2);
    return res;
    
    }
}