public class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> map=new HashMap<>();
    int[] res=new int[2];
    for(int i=0;i<=nums.length-1;++i){
        if(!map.containsKey(target-nums[i])){
            map.put(nums[i],i);
        }
        else{
            res[0]=map.get(target-nums[i]);
            res[1]=i;
        }
    }
    return res;
    }
}