public class Solution {
    public int subarraySum(int[] nums, int k) {
    if(nums==null||nums.length==0) return 0;
    HashMap<Integer, Integer> map=new HashMap<>();
    map.put(0,1);
    int sum=0,total=0;
    for(int i=0;i<nums.length;++i){
        sum+=nums[i];
        if(map.containsKey(sum-k)){
            total+=map.get(sum-k);
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
    }
    return total;
    }
    
}