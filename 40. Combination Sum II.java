public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    if(candidates==null||candidates.length==0) return res;
    List<Integer> temp=new ArrayList<>();
    Arrays.sort(candidates);
    backtracking(res,temp,candidates,0,target);
    return res;
    }
    public void backtracking(List<List<Integer>> res,List<Integer> temp,int[] nums,int start,int remain){
    if(remain==0) res.add(new ArrayList<Integer>(temp));
    else if(remain<0) return;
    else{
        for(int i=start;i<nums.length;++i){
            if(i>start&&nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            backtracking(res,temp,nums,i+1,remain-nums[i]);
            temp.remove(temp.size()-1);
        }
        
    }
    
    }
}