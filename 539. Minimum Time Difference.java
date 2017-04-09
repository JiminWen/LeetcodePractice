public class Solution {
    public int findMinDifference(List<String> timePoints) {
    int[] nums=new int[timePoints.size()];
    for(int i=0;i<timePoints.size();++i){
        String s=timePoints.get(i);
        nums[i]=Integer.valueOf(s.substring(0,2))*60+Integer.valueOf(s.substring(3,5));
            
    }
    Arrays.sort(nums);
    int min=Integer.MAX_VALUE;
    for(int i=0;i<nums.length-1;++i){
        int temp1=nums[i+1]-nums[i];
        int temp2=nums[i]-nums[i+1]+60*24;
        min=Math.min(temp1,min);
        min=Math.min(temp2,min);
    }
    min=Math.min(min,nums[nums.length-1]-nums[0]);
    min=Math.min(min,24*60+nums[0]-nums[nums.length-1]);
    return min;
    }
}