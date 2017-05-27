public class Solution {
    public int findMaxLength(int[] nums) {
    if(nums==null||nums.length==0)return 0;   
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;++i){
        if(nums[i]==0) nums[i]=-1;
    }
    map.put(0,0);
    int res=0,sum=0;
    for(int i=1;i<=nums.length;++i){
        sum+=nums[i-1];
        if(map.containsKey(sum)){
            res=Math.max(res,i-map.get(sum));
        }
        else{
            map.put(sum,i);
        }
    }
    return res;
    }
}