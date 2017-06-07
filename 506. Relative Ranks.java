public class Solution {
    public String[] findRelativeRanks(int[] nums) {
    if(nums==null||nums.length==0) return new String[0];
    HashMap<Integer,Integer> map=new HashMap<>();//map from value to index
    for(int i=nums.length-1;i>-1;--i){
        map.put(nums[i],i);
    }
    String[] res=new String[nums.length];
    Arrays.sort(nums);
    for(int i=nums.length-1;i>-1;--i){
        if(i==nums.length-1){
            res[map.get(nums[i])]=new String("Gold Medal");
        }
        else if(i==nums.length-2){
            res[map.get(nums[i])]=new String("Silver Medal");
        }
        else if (i==nums.length-3){
            res[map.get(nums[i])]=new String("Bronze Medal");
        }
        else{
            res[map.get(nums[i])]=Integer.toString(nums.length-i);
        }
    }
    return res;
    }
}