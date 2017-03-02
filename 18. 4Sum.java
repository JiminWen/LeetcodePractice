public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    if(nums==null||nums.length==0) return res;
    Arrays.sort(nums);
    for(int i=0;i<=nums.length-4;++i){
        if(i>0&&nums[i]==nums[i-1]) continue;
        for(int j=i+1;j<=nums.length-3;++j){
            if(j>i+1&&nums[j]==nums[j-1]) continue;
            int sum=target-nums[i]-nums[j];
            int low=j+1,high=nums.length-1;
            while(low<high){
                if(nums[low]+nums[high]==sum){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[low]);
                    temp.add(nums[high]);
                    res.add(temp);
                    
                    while(low<high&&nums[low]==nums[low+1]){
                        low++;
                    }
                    
                    while(low<high&&nums[high]==nums[high-1]){
                        high--;
                    }
                    low++;
                    high--;
                }
                else if(nums[low]+nums[high]<sum){
                    low++;
                    
                }
                else{
                    high--;
                }
            }
        }    
    }
    return res;
    }
}