public class Solution {
    public int findPairs(int[] nums, int k) {
    if(nums==null||nums.length==0||k<0) return 0;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int m:nums){
        map.put(m,map.getOrDefault(m,0)+1);
    }
    int count=0;
    for(int n:map.keySet()){
        if(k==0){
            if(map.get(n)>1) count++;
        }
        else{
            if(map.containsKey(n+k)){
                count++;
            }
        }
        
    }
    return count;
    }
}