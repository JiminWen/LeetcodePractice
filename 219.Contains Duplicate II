public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null||nums.length==0||k<1){
            return false;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        for(int j=0;j<nums.length;++j){
            if(map.containsKey(nums[j])){
                i=map.get(nums[j]);
                if(j-i<=k){
                    return true;
                }
                else{
                    map.put(nums[j],j);
                }
            }
            else{
                map.put(nums[j],j);
            }
        }
        return false;
    }
}