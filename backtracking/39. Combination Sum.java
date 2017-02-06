public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(candidates==null||candidates.length==0){
            return res;
        }
        backtracking(res,new ArrayList<Integer>(),candidates,0,target);
        return res;
    }
    private void backtracking(List<List<Integer>> res,List<Integer> temp,int[] nums,int start,int remain){
        if(remain<0) return;
        else if(remain==0){
            res.add(new ArrayList<Integer>(temp));
        }
        else{
            for(int i=start;i<=nums.length-1;++i){
                temp.add(nums[i]);
                backtracking(res,temp,nums,i,remain-nums[i]);
                temp.remove(temp.size()-1);
            }
        }
    }
}