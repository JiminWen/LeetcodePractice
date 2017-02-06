public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    Arrays.sort(nums);
    backtracking(res,new ArrayList<Integer>(),nums,0);
    return res;    
    }
    private void backtracking(List<List<Integer>> res,List<Integer> temp,int[] nums,int start){
    res.add(new ArrayList<Integer> (temp));
    for(int i=start;i<=nums.length-1;++i){
        temp.add(nums[i]);
        backtracking(res,temp,nums,i+1);
        temp.remove(temp.size()-1);
    }
    
    }    
}