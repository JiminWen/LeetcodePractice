public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
    if(nums==null||nums.length==0) return false;
    HashMap<Integer,Integer> map=new HashMap<>();
    int sum=0;
    map.put(0,0);
    for(int i=1;i<=nums.length;++i){
        sum+=nums[i-1];
        // if(k==0&&sum!=0) return false;
        int mod=k==0?sum:sum%k;
        if(map.containsKey(mod)){
            if(i-map.get(mod)>1){
              return true;
            }
        }    
        else map.put(mod,i);
        
    }
    return false;
    }
}